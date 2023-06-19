#lang racket
(provide superreverse)

;; superreverse: a variant of the function reverse which
;; reverses all top level lists using a higher order function
;; inputs: list L
;; output: list identical to L but top level lists are reversed
(define (superreverse L)
  (map reverse L)) ;uses higher order function map and applies reverse to each element of L