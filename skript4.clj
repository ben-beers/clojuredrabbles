;;This is just a demonstration of multi-arity functions.

(defn messenger
  ([]     (messenger "Hello world!"))
  ([msg]  (println msg)))

(defn list-of-squares
  ([] (list-of-squares [0]))
  ([x] (map (fn [y] (* y y)) x )))
