(ns destructuring
  (:require [clojure.core.match :refer [match]]))

(defn -main []
  (println "=== Pattern Matching & Restructuring ===")

  ;; Destructuring (Restructuring)
  ;; Sequential Destructuring (Vectors/Lists)
  (def my-point [10 20])
  (let [[x y] my-point]
    (println "Destructured Point - x:" x ", y:" y))

  ;; Associative Destructuring (Maps)
  (def person {:name "Bob" :age 25 :occupation "Builder"})
  (let [{:keys [name age]} person]
    (println "Destructured Person - Name:" name ", Age:" age))

  ;; Pattern Matching using clojure.core.match
  (defn fizzbuzz [n]
    (match [n]
      [(_ :guard #(zero? (mod % 15)))] "FizzBuzz"
      [(_ :guard #(zero? (mod % 3)))]  "Fizz"
      [(_ :guard #(zero? (mod % 5)))]  "Buzz"
      :else n))

  (println "Pattern Matching (FizzBuzz):")
  (doseq [i (range 1 16)]
    (println i ":" (fizzbuzz i)))
    
  ;; Pattern matching on structure
  (defn describe-data [data]
    (match [data]
      [[x y]] (str "A pair: " x ", " y)
      [{:name n}] (str "A person named " n)
      :else "Unknown data"))

  (println "Match Pair:" (describe-data [1 2]))
  (println "Match Person:" (describe-data {:name "Alice" :age 30})))
