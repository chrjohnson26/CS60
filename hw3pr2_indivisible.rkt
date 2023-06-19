#lang racket
(provide indivisible)

;; indivisible: determines the elements in a list of integers
;; which are not divisible by a specified integer using filter
;; inputs: a positive integer e and a list L of positive integers
;; output: a list of integers which are not divisible by e
(define (indivisible e L)
  (filter (lambda (num)
            (not(= (modulo num e) 0)))L)) ;#t if modulus of a list element and e is not 0