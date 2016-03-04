; evaluate expressions, notice the prefix-notation

(println "Hello world")

(println (+ 5 9))

(println (- 100 333))

(println (/ 10 5))

(println (+ 2.7 10))

(println (* 5 6))

(println (+ (* 3 5 ) (- 10 6)))

; variable value
(def size 2)

(println "Size is" size)

(println (* (+ 2 2 ) size))

(def pi 3.14159)
(def radius 10)

(println "radius" (* radius radius))

(def circumference (* 2 pi radius))
(println "circumference" circumference)

(println (*
           (+ 2 (* 4 6))
           (+ 3 5 7)))

(defn square [x]
  (if x
    (* x x)
    0)
  )

(println "Square of" 4 "is" (square 4))
(println "Square of" nil "is" (square nil))

(defn sum-of-squares [x y]
  (+ (square x) (square y)))

(println "sum-square of" 4 "and" 5 "is" (sum-of-squares 4 5))
(println "sum-square of" 4 "and" nil "is" (sum-of-squares 4 nil))

(defn abs [x]
  (if x
    (cond (> x 0) x
          (= x 0) 0
          (< x 0) (- x))
    0))

(println "abs of" 3 "is" (abs 3))
(println "abs of" nil "is" (abs nil))


;; excersises
10
(+ 5 3 4)
(- 9 1)
(/ 6 2)
(+ (* 2 4) (- 4 6))
(def a 3)
a
(def a (+ 3 1))
a
(+ a a (* a a ))
(= a a )

(println (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5 )))))
   (* 3 (- 6 2) (- 2 7))
   ))

(/ 74 (- 60))

;; Define a procedure that takes three
;; numbers as arguments and returns the
;; sum of the squares of the two larger numbers.

(defn sq1 [a b c]
  (cond
    (and (>= a b) (>= b c )) (+ (square a) (square b))
    (and (>= a b) (<= b c )) (+ (square a) (square c))
    (and (<= a b) (>= a c )) (+ (square a) (square b))
    (or) (+ (square b) (square c))
   )
  )
(sq1 3 2 1)

