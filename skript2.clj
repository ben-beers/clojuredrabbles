(defn avg [a b]
  (/ (+ a b) 2.0))

(defn approx [guess radicand]

  (avg guess (/ radicand guess)))

(defn abs [n] (max n (- n)))

(defn good-enough? [guess radicand tolerance]

   (def subtrahend (approx guess radicand))
   (def difference (abs (- guess subtrahend)))
 ;(print minuend " " subtrahend "\n")
   (< difference tolerance))

(defn reprox [guess radicand tolerance]
  (def current-val (approx guess radicand))
  (cond
        (good-enough? current-val radicand tolerance) current-val
        :else (reprox current-val radicand tolerance)))

