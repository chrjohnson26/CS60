#lang racket

(require rackunit)
(require "hw2pr1_remove-all.rkt")


; student tests
(check-equal? (remove-all 1 '(1 0 0))
              '(0 0))
(check-equal? (remove-all 1 '(0 0 1))
              '(0 0))
(check-equal? (remove-all 1 '(0 0 0))
              '(0 0 0))
(check-equal? (remove-all 1 '(1 1 1))
              '())
(check-equal? (remove-all 1 '())
              '())
; provided tests
(check-equal? (remove-all "i" '("a" "l" "i" "i" "i" "e" "n")) 
              '("a" "l" "e" "n"))
(check-equal? (remove-all "i" '( ("a" "l" "i") "i" "i" "e" "n")) 
              '(("a" "l" "i") "e" "n"))
(check-equal? (remove-all 0 '(1 0 1 0 1 0))  
              '(1 1 1))

