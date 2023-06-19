#lang racket
(require rackunit)
(require "hw3pr2_indivisible.rkt")
;student test
(check-equal? (indivisible 0 '()) '())
(check-equal? (indivisible 1 '(1)) '())

;provided test
(check-equal? (indivisible 3 '(2 3 4 5 6 7 8 9 10 )) '(2 4 5 7 8 10))
