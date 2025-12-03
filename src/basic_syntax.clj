(ns basic-syntax)

(defn -main []
  (println "=== Basic Syntax & Data Structures ===")
  
  ;; Variables (Defs)
  (def my-name "Clojure User")
  (println "Variable my-name:" my-name)

  ;; Lists (Linked lists, good for sequential access)
  (def my-list '(1 2 3 4 5))
  (println "List:" my-list)
  (println "First of list:" (first my-list))

  ;; Vectors (Arrays, good for random access)
  (def my-vector [1 2 3 4 5])
  (println "Vector:" my-vector)
  (println "Element at index 2:" (get my-vector 2))

  ;; Maps (Key-value pairs)
  (def my-map {:name "Alice" :age 30 :city "Wonderland"})
  (println "Map:" my-map)
  (println "Value for :name:" (:name my-map))

  ;; Sets (Unique elements)
  (def my-set #{1 2 3 3 4}) ; Duplicate 3 will be removed
  (println "Set:" my-set)
  (println "Contains 2?:" (contains? my-set 2)))
