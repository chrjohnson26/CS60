#lang racket
(provide power fast-power)

;; power: raises number base to power
;;   input: two non-negative integers, base and pow
;;   output: non-negative integer, base^pow
(define (power base pow)
  (if (= pow 0) ;base case
      1
      (* base (power base (- pow 1))))) ;recursive case

;; power: raises number base to power
;;   input: two non-negative integers, base and pow
;;   output: non-negative integer, base^pow
(define (fast-power base pow)
  (cond
    [(= pow 0) 1] ;base case
    [(odd? pow) (* base (power base (- pow 1)))] ; odd recurseive case
    [else (let ([halfpow (fast-power base (/ pow 2))]) ; even recursive case
         (* halfpow halfpow))]))