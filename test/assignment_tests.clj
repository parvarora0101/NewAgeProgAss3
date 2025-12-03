(ns assignment-tests
  (:require [clojure.test :refer :all]
            [functional-concepts :refer [add]]))

(deftest test-add-function
  (testing "Addition of positive numbers"
    (is (= 5 (add 2 3))))
  (testing "Addition with negative numbers"
    (is (= -1 (add 2 -3)))))

(deftest test-arithmetic
  (testing "Basic Arithmetic"
    (is (= 4 (* 2 2)))
    (is (= 2 (/ 4 2)))))

(defn -main []
  (run-tests 'assignment-tests))
