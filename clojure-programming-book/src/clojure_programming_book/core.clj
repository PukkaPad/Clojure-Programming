(ns clojure-programming-book.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; Function that calculates the average
(defn average
  "This function calculates the average of a vector of numbers.
  Usage: (average [60 10 5 20]) "
  [numbers]
  (/ (apply + numbers) (count numbers)))
