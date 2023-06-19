#lang racket
(require rackunit)
(require "hw1pr3_count1bits.rkt")

; Student Tests
(check-equal? (count1bits 0) 0)
(check-equal? (count1bits 1) 1)

; Provided Tests
(check-equal? (count1bits 6) 2)
(check-equal? (count1bits 7) 3)
(check-equal? (count1bits 42) 3)
