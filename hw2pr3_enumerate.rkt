#lang racket
(provide enumerate)

;; enumerate-helper: pairs elements in list L with count
;; inputs: integer count and list L
;; output: list identical to L with each element paired with count
(define (enumerate-helper count L)
  (if (empty? L)
      '()
      (cons(cons count (cons (first L) '()))
         (enumerate-helper (+ count 1) (rest L)))))


;; enumerate: pairs elements in list L with an index
;;  inputs: list L
;;  output: list identical to L with each element now paired with an
;;  index starting at 0
(define (enumerate L)
  (if (empty? L)
      '()
      (cons(cons 0 (cons (first L) '()))
         (enumerate-helper 1 (rest L)))))