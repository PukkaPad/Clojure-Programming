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

;; Homoiconicity
                                        ; code as data

;; The Reader
(pr-str [1 2 3])
(read-string "[1 2 3]")

;; Scalar literals
                                        ; Strings
                                        ; Booleans
                                        ; nill
                                        ; Characters: denoted by backslash
                                        ; Keywords: always prefixed with a colon
(def person {:name "Sandra Cruz"
             :city "Portland, ME"})
(:city person)

(def pizza {:name "Ramuto's"
            :location "Claremont, NH"
            ::location "43.3734, -72.3365"})

pizza

(::location pizza)

(name :user/location)
(namespace :user/location)
(namespace :location)
                                        ; Symbols
                                        ; Numbers
                                        ; Regular expressions
(class #"(p|h)ail")
(re-seq #"(...) (...)" "foo bar")
;; Comments: ;  #_ comment
(read-string "(+ 1 2 #_(* 2 2) 8)")
;; Whitespace and Commas
;; Collection leterals: '
;; Namespaces

;; Special Forms
                                        ; Supressing Evaluation: quote
(quote x)
'x
'(+ x x)
(list? '(+ x x))
                                        ; Code Blocks: do
