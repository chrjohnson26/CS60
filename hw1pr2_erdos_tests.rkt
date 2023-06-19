#lang racket

(require rackunit)              ; load the testing framework
(require "hw1pr2_erdos.rkt")    ; load your definitions


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Testing erdos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; student tests
(check-equal? (erdos 10) 5)
(check-equal? (erdos 3) 10)
(check-equal? (erdos 1) 4)


; provided tests
(check-equal? (erdos 84) 42)
(check-equal? (erdos 85) 256)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Testing erdos-count
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; student tests
(check-equal? (erdos-count 3) 7)
(check-equal? (erdos-count 2) 1)
(check-equal? (erdos-count 1) 0)


; provided tests
(check-equal? (erdos-count 26) 10)
(check-equal? (erdos-count 27) 111)

