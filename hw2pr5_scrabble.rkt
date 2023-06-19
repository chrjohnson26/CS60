#lang racket
(provide subbag? best-word score-letter score-word max-score combine-score)

;; subbag?: determines if list B contains all elements in S with a count at least as large
;; inputs: list B bag and list S sub
;; outputs: boolean #t or #f based on B contains all elements in S
(define (subbag? S B)
  (cond
    [(empty? S) #t]
    [(empty? B) #f]
    [(member (first S) B) (subbag? (rest S) (remove (first S) B))]
    [else #f]))

;;score-letter: determines a given letter's scrabble score
;;inputs: letter
;;output: an integer which represents the input letter's score
(define (score-letter letter)
  (first(rest(assoc letter scrabble-tile-bag))))

;;score-word: determines the scrabble score of a given word
;; input: a string word
;; output: integer representing the scrabble score of word
(define (score-word word)
  (if (empty? (string->list word))
      0
      (+ (score-letter (first (string->list word)))
         (score-word (list->string (rest (string->list word)))))))

;;combine-score: returns a list containing the score and the word given a list of words
;; input: list fWl containing words
;; output: a list of lists containing the score and its corresponding word
(define (combine-score fWL)
  (if (empty? fWL)
      '()
      (cons (append (list(score-word(first fWL)))
                    (list(first fWL)))
            (combine-score (rest fWL)))))

;;max-score: returns the word in the list with the largest score
;; input: list L which elements containing a list of word and scrabble score
;; output: list containing the largest score and word
(define (max-score L)
  (cond [(empty? L) '(0 "")]
        [(> (first (first L))
            (first (max-score (rest L))))
         (first L)]
        [else (max-score (rest L))]))

;; scrabble-tile-bag  
;;   letter tile scores and counts from the game of Scrabble
;;   the counts are not needed
;;   obtained from http://en.wikipedia.org/wiki/Image:Scrabble_tiles_en.jpg
(define scrabble-tile-bag
  '((#\a 1 9) (#\b 3 2) (#\c 3 2) (#\d 2 4) (#\e 1 12)
   (#\f 4 2) (#\g 2 3) (#\h 4 2) (#\i 1 9) (#\j 8 1)
   (#\k 5 1) (#\l 1 4) (#\m 3 2) (#\n 1 6) (#\o 1 8)
   (#\p 3 2) (#\q 10 1)(#\r 1 6) (#\s 1 4) (#\t 1 6)
   (#\u 1 4) (#\v 4 2) (#\w 4 2) (#\x 8 1) (#\y 4 2)
   (#\z 10 1) (#\_ 0 2)) ) 
;; end define scrabble-tile-bag
;; The underscore is used to represent a blank tile, which is a wild-card


;; best-word: determines what word in a list is the highest scoring scrabble
;; word and how many points that word is
;; inputs: string rack and list of strings WL
;; output: a two element list containing the best word from WL and its score
(define (best-word rack WL)
  (let* ([word-list (combine-score WL)]
         [max (max-score word-list)]
         [final-value (append (rest max)(list(first max)))]
         [max-score (first(rest max))])
  (cond [(empty? WL) '("" 0)] 
        [(subbag? (string->list max-score)
                  (string->list rack)) final-value]
        [else (best-word rack (remove max-score WL))])))