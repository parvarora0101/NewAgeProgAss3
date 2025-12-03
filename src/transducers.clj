(ns transducers)

(defn -main []
  (println "=== Data Transformation with Transducers ===")

  (def data (range 20))
  (println "Input Data:" data)

  ;; Define a transducer: filter evens, then increment, then take 5
  (def xform
    (comp
      (filter even?)
      (map inc)
      (take 5)))

  ;; Use the transducer with 'sequence' (lazy)
  (println "Transformed Sequence:" (sequence xform data))

  ;; Use the transducer with 'into' (eager, into a collection)
  (println "Transformed into Vector:" (into [] xform data))

  ;; Use the transducer with 'transduce' (reduce with a transducer)
  (def sum-transformed (transduce xform + 0 data))
  (println "Sum of transformed elements:" sum-transformed))
