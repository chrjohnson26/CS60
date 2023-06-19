#lang racket

(provide matches)
(provide lotto-winner)


;; matches: finds the number of matches between ticket and winning numbers
;;   inputs: tickets - lotto ticket, list of numbers
;;             expected format:  '(name # # ... #)
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the number elements that match between tickets and winning-numbers
(define (matches ticket winning-numbers)
  (length 
   (filter (lambda (potential-match) 
             (member potential-match winning-numbers))
           ticket)))

;; lotto-winner: finds the name and number of the winning ticket
;;   inputs: list-of-tickets - list of lotto tickets, list of lists of numbers
;;             expected format:  '((name1 # # ... #) ... (nameN # # ... #)) 
;;           winning-numbers - winning numbers, list of numbers
;;             expected format:  '(# # .. #)
;;   output: the name and number of matching tickets from the ticket 
;;           with the most matches in winning-numbers
(define (lotto-winner list-of-tickets winning-numbers)
  (cond
    [(empty? list-of-tickets) '()]
    [(empty? winning-numbers) '()]
    [else
     ;sorts through list-of-tickets using a key
     (let* ([max (sort list-of-tickets > #:key
                       ;lambda function which finds the matches of a given ticket
                       (lambda (ticket) (matches ticket winning-numbers)))]
        [max-matches (matches (rest (first max)) winning-numbers)]
        [max-name (first (first max))])
    max-name max-matches
       (if (= max-matches 0)
           '()
           (append (list max-name)
               (list max-matches))))]))