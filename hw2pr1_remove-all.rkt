#lang racket
(provide remove-all)


;; remove-all: removes all top-level instances of element from list
;;  inputs: element to remove, elem
;;          list to remove from, L
;;  output: list identical to L with all top-level instances of elem removed
(define (remove-all elem L)
  (cond
    [(empty? L) '()] ;base case: returns empty
    [(equal? (first L) elem) ;recursive case when first element is equal to elem
     (remove-all elem (rest L))] 
    [else ; recursive case when first element isn't equal to elem
     (cons (first L) (remove-all elem (rest L)))]))