(ns concurrency-demo.core
  (:gen-class))
(require '[clojure.set :as set])

(load "count")
(load "quicksort")
(load "sort")

(def my-array [5,2,1,6,-3,2,7,2,6,4,9])




(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (double-the-number 1)) ;; 2
  (println (add 1 2)) ;; 3
  (println (count-numbers-using-recursion 6)) ;; 21
  (println (count-numbers-using-loop 6)) ;; 21
  (println (count-numbers-using-atom 6)) ;; 21

  (println my-array "is not sorted")

  (println (quicksort my-array) "should be sorted")
  )


