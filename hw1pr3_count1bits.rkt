#lang racket
(provide count1bits)

;; count1bits: finds the number of times the bit 1 appears in N
;;   input: a positive integer, N
;;   output: Integer Amount of times bit 1 appears in binary N

(define (count1bits N)
  (cond
    [(= N 0) 0]
    [(even? N) (+ 0 (count1bits (quotient N 2)))] ;N is even so there is no bit 1
    [else (+ 1 (count1bits (quotient N 2)))])) ;N is odd so there is a bit 1
  
  