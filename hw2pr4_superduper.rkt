#lang racket
(provide superreverse duperreverse)

;; superreverse: a variant of the function reverse which
;; reverses all top level lists
;; inputs: list L
;; output: list identical to L but top level lists are reversed
(define (superreverse L)
  (if (empty? L)
      '() ; base case
      (cons (reverse (first L)) ;adds reverse of list in first element
            (superreverse (rest L))))) ;recursive call

;; duperreverse: a variant of the function reverse which
;; reverses on a deep level
;; inputs: list L
;; output: list identical to L but is reversed on every level
(define (duperreverse L)
  (cond [(empty? L) '()] ;base case
        [(list? (first L)) ;if first element is a list
         (append (duperreverse (rest L)) 
                 (cons (duperreverse (first L)) '()))]
        [else (append (duperreverse (rest L)) ;if first element is not a list
                      (cons (first L) '()))]))