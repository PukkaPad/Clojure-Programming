(ns chapter-1.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; Averaging numbers
; 'apply' is used to apply fn to the argument 
(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(average [3 4 5])

;; Expressions, Operators, Syntax and Precedence
; 1. Lists () are calls, where the 1st value is the operator and the rest of the values are parameters
; 2. Symbols (such as average or +)  evaluate to the named value in the current scope
; 3. All the other expressions evauate to the literal values they describe
