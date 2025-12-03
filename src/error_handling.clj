(ns error-handling)

(defn safe-divide [a b]
  (try
    (/ a b)
    (catch ArithmeticException e
      (println "Error: Division by zero!")
      nil)
    (catch Exception e
      (println "Error: Unknown error occurred:" (.getMessage e))
      nil)
    (finally
      (println "Operation attempted."))))

(defn -main []
  (println "=== Error Handling ===")

  (println "Safe Divide 10 / 2:")
  (println "Result:" (safe-divide 10 2))

  (println "\nSafe Divide 10 / 0:")
  (println "Result:" (safe-divide 10 0))
  
  ;; Using ex-info and ex-data
  (defn validate-age [age]
    (if (< age 0)
      (throw (ex-info "Age cannot be negative" {:age age :error-code :negative-age}))
      (println "Age is valid:" age)))

  (println "\nValidating Age:")
  (try
    (validate-age -5)
    (catch Exception e
      (println "Caught Exception:" (.getMessage e))
      (println "Exception Data:" (ex-data e)))))
