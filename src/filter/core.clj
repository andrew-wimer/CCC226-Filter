(ns filter.core
  (:gen-class))

;; FILTER PROJECT
;; CREATED BY: Andrew Wimer
;; Due Sat May 16 2020
;; Program Filter should contain a “removeWhen ( )” function that
;; takes two parameters, a target and a list. removeWhen() needs to
;; return a list that consists of all the (non-nil) values that don’t
;; match the target (argument).
;; Requirement:   Your solutions need to have subprograms, recursion, and
;; parameters (that maybe subprograms).


(def finalList (list))

(def totalList '("Joe" "Boe" "Meany" "Doe" "Moe" "Doe" "Joe" "Toe"))

;;
;; notNil [element]
;; evaluates true if an element is not nil, false if an element is nil
;;
(defn notNil [element]
  (false? (nil? element))
  )

;;
;; notTarget [element]
;; evaluates true if an element is not the desired target to filter, false
;; if the element element is  the desired target
;;
(defn notTarget [target element]
  (false? (= target element))
  )

;;
;; removeWhen [target paramList]
;; iterates a parameterized list through recursion.
;; If the element being examined is the target, the
;; function calls itself again with a popped version of the parameterized list.
;; If the element examined is not the target, it is added to a list, whereby
;; the function is called once again.
;; When there are no more nil values and the original list is fully examined, the function
;; returns the new list minus the target or nil values.
;;
(defn removeWhen [target paramList]
  (if (notTarget target (first paramList))
    (when (notNil (first paramList))
      ;;(cons (first paramList) finalList)
      (cons (first paramList) (removeWhen target (pop paramList)))
      ;;(findUnique target (rest paramList))

      )
    (removeWhen target (pop paramList)
                )
    ;; (cons (first paramList) finalList)
    ))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(comment "output"
         ;;         (removeWhen "Doe" totalList)
         ;;        => ("Joe" "Boe" "Meany" "Moe" "Joe" "Toe")
         ;;      (removeWhen "Joe" totalList)
         ;;     => ("Boe" "Meany" "Doe" "Moe" "Doe" "Toe")
         )