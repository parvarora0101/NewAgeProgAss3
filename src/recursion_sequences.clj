(ns recursion-sequences)

(defn -main []
  (println "=== Recursion & Sequence Operations ===")

  ;; Recursion
  ;; Calculating Factorial using recursion
  (defn factorial [n]
    (if (<= n 1)
      1
      (* n (factorial (dec n)))))
  
  (println "Factorial of 5:" (factorial 5))

  ;; Tail Recursion using recur (optimized)
  (defn factorial-tail [n]
    (loop [cnt n acc 1]
      (if (zero? cnt)
        acc
        (recur (dec cnt) (* acc cnt)))))
  
  (println "Factorial (tail-recursive) of 5:" (factorial-tail 5))

  ;; Sequence Operations
  (def numbers [1 2 3 4 5 6 7 8 9 10])
  (println "Original numbers:" numbers)

  ;; Map: Apply a function to every element
  (def squared (map #(* % %) numbers))
  (println "Squared (map):" squared)

  ;; Filter: Keep elements that satisfy a predicate
  (def evens (filter even? numbers))
  (println "Evens (filter):" evens)

  ;; Reduce: Accumulate a result
  (def sum (reduce + numbers))
  (println "Sum (reduce):" sum))
