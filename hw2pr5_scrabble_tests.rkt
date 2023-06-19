#lang racket
(require rackunit)
(require "hw2pr5_scrabble.rkt")

; student case subbag?
(check-true (subbag? '() '()))
(check-true (subbag? '(1) '(1 1)))
(check-false (subbag? '(1) '()))

; provided case subbag?
(check-true  (subbag? '()      '(s p a m s)) )
(check-true  (subbag? '(s s)   '(s p a m s)) )
(check-true  (subbag? '(s m)   '(s p a m s)) )
(check-true  (subbag? '(a p)   '(s p a m s)) )
(check-false (subbag? '(a m a) '(s p a m s)) )
(check-true  (subbag? '(a s)   '(s a))       )

; provided case score-letter
(check-equal? (score-letter '#\w) 4)

;student case score-letter
(check-equal? (score-letter '#\a) 1)
(check-equal? (score-letter '#\m) 3)

;student case score-word
(check-equal? (score-word "")  0)
(check-equal? (score-word "bab") 7)

;provided case score-word
(check-equal? (score-word "zzz")  30)
(check-equal? (score-word "fortytwo") 17)
(check-equal? (score-word "twelve")  12)

;max-score tests
(check-equal? (max-score '()) '(0 ""))
(check-equal? (max-score '((3 "aaa") (3 "zzz"))) '(3 "zzz"))

;combine-score tests
(check-equal? (combine-score '("aaa")) '((3 "aaa")))
(check-equal? (combine-score '("aaa" "zzz")) '((3 "aaa") (30 "zzz")))

;student case best-word
(check-equal? (best-word "student" '("dent" "dent")) 
 '("dent" 5))
(check-equal? (best-word "" '("")) 
 '("" 0))

;provided case best-word
(check-equal? (best-word "academy" '("ace" "ade" "cad" "cay" "day")) 
 '("cay" 8))
(check-equal? (best-word "appler"  '("peal" "peel" "ape" "paper")) 
 '("paper" 9))
(check-equal? (best-word "paler"   '("peal" "peel" "ape" "paper"))
 '("peal" 6))
(check-equal? (best-word "kwyjibo" '("ace" "ade" "cad" "cay" "day"))
 '("" 0))



