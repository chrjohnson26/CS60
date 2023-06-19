#lang racket

;; Two functions will be treated as publicly accessible
;;   (so that we can test them)
(provide erdos erdos-count)


;; erdos: the "erdos" function
;;   input: a positive integer, N
;;   output: 3N+1, if N is odd
;;           N/2, if N is even
(define (erdos N)
  (if (odd? N)
      (+ (* N 3) 1)
      (quotient N 2)))

; erdos-count: counts how many times the erdos function needs to
; run before the output is 1
;    input: a positive integer, N
;    output: how many times erdos ran before outputing 1
(define (erdos-count N)
  (if (= N 1)
      0
      (+ 1 (erdos-count (erdos N))))) ;recursive case