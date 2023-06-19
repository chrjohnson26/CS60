#lang racket

(require rackunit)
(require "hw2pr2_prefix_sublist.rkt")

; prefix student tests
(check-true  (prefix? '(s)    '(s p a m)))
(check-true  (prefix? '(s p a)    '(s p a m)))
(check-true  (prefix? '()    '()))
(check-false  (prefix? '(s p a m)    '()))
(check-true  (prefix? '(s s)    '(s s s)))
(check-false  (prefix? '(s s s)    '(s s)))

; prefix provided tests
(check-true  (prefix? '()    '(s p a m)))
(check-true  (prefix? '(s p) '(s p a m)))
(check-false (prefix? '(s m) '(s p a m)))
(check-false (prefix? '(p a) '(s p a m)))

; sublist student tests
(check-true (sublist? '() '()))
(check-false (sublist? '(s p) '()))
(check-true (sublist? '(a m) '(s p a m)))

; subslist provided tests
(check-true  (sublist? '()    '(s p a m)))
(check-true  (sublist? '(s p) '(s p a m)))
(check-false (sublist? '(s m) '(s p a m)))
(check-true  (sublist? '(p a) '(s p a m)))