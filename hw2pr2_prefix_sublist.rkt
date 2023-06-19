#lang racket
(provide prefix? sublist?)

;; prefix?: checks if P is identical to the initial elements of list L
;;  inputs: two lists, prefix list P and main list L
;;  output: returns #t if list P is identical to  list L, returns #f if not
(define (prefix? P L)
  (cond
    [(empty? P) #t]
    [(empty? L) #f]
    [(equal? (first P) (first L)) (prefix? (rest P) (rest L))]
    [else #f]))

;; sublist? checks if list S is the same as some
;; consecutive elements of list L
;;  inputs: two lists, sublist list S and main list L
;;  output: returns #t if list P is identical to some consecutive part L
;;  returns #f if not
(define (sublist? S L)
  (cond
    [(empty? S) #t] ;if S list is empty return true
    [(empty? L) #f] ;if L list is empty return false
    [(equal? (first S) (first L))
     (prefix? (rest S) (rest L))] ;runs helper function prefix? to test consecutive element(s)
    [else (sublist? S (rest L))])) ;recursive case if first elements of S and L don't match

