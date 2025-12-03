(ns data-driven
  (:require [clojure.edn :as edn]
            [my-readers]))

(defn -main []
  (println "=== Data-Driven Development ===")

  ;; Data-Driven Logic: Using a map to dispatch actions (Polymorphism without classes)
  (def commands
    {:greet (fn [name] (str "Hello, " name "!"))
     :farewell (fn [name] (str "Goodbye, " name "."))
     :shout (fn [name] (str (clojure.string/upper-case name) "!!!"))})

  (defn execute-command [cmd name]
    (if-let [f (get commands cmd)]
      (f name)
      (str "Unknown command: " cmd)))

  (println "Command :greet ->" (execute-command :greet "Alice"))
  (println "Command :shout ->" (execute-command :shout "Bob"))

  ;; Data Literals and Readers
  ;; We defined a custom reader tag #unit/point in data_readers.clj
  ;; and the implementation in my_readers.clj
  
  (println "\nReading custom data literal #unit/point [10 20]...")
  
  ;; Using clojure.edn/read-string with explicit readers map for demonstration
  (def point-str "#unit/point [10 20]")
  
  (def parsed-point 
    (edn/read-string {:readers {'unit/point my-readers/read-point}} point-str))
    
  (println "Parsed Point:" parsed-point)
  (println "Class of Point:" (type parsed-point))
  (println "X coordinate:" (:x parsed-point)))
