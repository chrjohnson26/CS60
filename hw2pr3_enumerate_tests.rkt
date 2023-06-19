#lang racket

(require rackunit)
(require "hw2pr3_enumerate.rkt")

; student cases
(check-equal? (enumerate '(1))  '((0 1)))
(check-equal? (enumerate '(0 0 0))
                         '((0 0) (1 0) (2 0)))



;provided cases
(check-equal? (enumerate '(0 I II III IV V VI)) 
                         '((0 0) (1 I) (2 II) (3 III) (4 IV) (5 V) (6 VI)))

(check-equal? (enumerate '())  '())
