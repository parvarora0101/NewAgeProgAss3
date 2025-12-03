(ns data-manipulation)

(def employees
  [{:id 1 :name "Alice" :department "Engineering" :salary 80000}
   {:id 2 :name "Bob" :department "Sales" :salary 60000}
   {:id 3 :name "Charlie" :department "Engineering" :salary 85000}
   {:id 4 :name "David" :department "HR" :salary 55000}
   {:id 5 :name "Eve" :department "Sales" :salary 65000}])

(defn -main []
  (println "=== Data Manipulation with Sequences ===")
  (println "Dataset:" employees)

  ;; 1. Filter employees in Engineering
  (def engineers (filter #(= (:department %) "Engineering") employees))
  (println "\nEngineers:" engineers)

  ;; 2. Map to get only names of engineers
  (def engineer-names (map :name engineers))
  (println "Engineer Names:" engineer-names)

  ;; 3. Calculate total salary using reduce
  (def total-salary (reduce + (map :salary employees)))
  (println "Total Salary:" total-salary)

  ;; 4. Sort employees by salary (descending)
  (def sorted-by-salary (sort-by :salary > employees))
  (println "\nEmployees sorted by salary (desc):" sorted-by-salary)

  ;; 5. Group by department
  (def by-department (group-by :department employees))
  (println "\nGrouped by Department:" by-department))
