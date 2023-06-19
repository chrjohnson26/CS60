#lang racket
(require rackunit)
(require "hw1pr4_power.rkt")

; Student Tests
(check-equal? (power 1 0) 1)
(check-equal? (power 0 0) 1)
(check-equal? (power 0 1) 0)

; Provided Tests
(check-equal? (power 2 10) 1024)
(check-equal? (power 42 10) 17080198121677824)

; Student Tests
(check-equal? (fast-power 1 0) 1)
(check-equal? (fast-power 0 0) 1)
(check-equal? (fast-power 0 1) 0)
(check-equal? (fast-power 2 2) 4)
(check-equal? (fast-power 2 3) 8)

; Provided Tests
(check-equal? (fast-power 2 10) 1024)
(check-equal? (fast-power 42 10) 17080198121677824)