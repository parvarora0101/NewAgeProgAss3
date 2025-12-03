(ns functional-concepts)

(defn -main []
  (println "=== Functional Programming Concepts ===")

  ;; Pure Function
  ;; A function that always produces the same output for the same input and has no side effects.
  (defn add [a b]
    (+ a b))
  
  (println "Pure function (add 5 3):" (add 5 3))

  ;; Immutability
  ;; Data structures in Clojure are immutable. Changing them produces a new version.
  (def original-vector [1 2 3])
  (def new-vector (conj original-vector 4))
  
  (println "Original Vector:" original-vector)
  (println "New Vector (after conj):" new-vector)
  (println "Original is unchanged:" (= original-vector [1 2 3]))

  ;; Higher-Order Functions
  ;; Functions that take other functions as arguments or return them.
  (defn apply-operation [f x y]
    (f x y))

  (println "Higher-order function (apply-operation + 10 20):" (apply-operation + 10 20))
  (println "Higher-order function (apply-operation * 10 20):" (apply-operation * 10 20))
  
  ;; Returning a function
  (defn multiplier [factor]
    (fn [x] (* x factor)))
  
  (def double-it (multiplier 2))
  (println "Returned function (double-it 5):" (double-it 5)))
