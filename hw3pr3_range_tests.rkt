#lang racket

(require rackunit)
(require "hw3pr3_range.rkt")


; provided definitions calling make-range-predicate
(define value1to3?   (make-range-predicate 0 4))
(define value1to100? (make-range-predicate 0 101))

; student definitions calling make-range-predicate
(define value1to1?   (make-range-predicate 0 2))
(define value1to2? (make-range-predicate 0 3))

; provided test cases for value1to3? and value1to100?
(check-equal? (value1to3? 0)  false)
(check-equal? (value1to3? 1)  true)
(check-equal? (value1to3? 2)  true)
(check-equal? (value1to3? 3)  true)
(check-equal? (value1to3? 4)  false)
(check-equal? (value1to3? 42) false)

(check-equal? (value1to100? 0)   false)
(check-equal? (value1to100? 1)   true)
(check-equal? (value1to100? 20)  true)
(check-equal? (value1to100? 42)  true)
(check-equal? (value1to100? 100) true)
(check-equal? (value1to100? 101) false)
(check-equal? (value1to100? 999) false)

(check-equal? (value1to1? 0)  false)
(check-equal? (value1to1? 1)  true)
(check-equal? (value1to1? 2)  false)

(check-equal? (value1to2? 0)  false)
(check-equal? (value1to2? 1)  true)
(check-equal? (value1to2? 2)  true)