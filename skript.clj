(defn square [a] (* a a))
(defn get-squares [coll] (map square coll))
(defn sum-squares [coll] (reduce + (get-squares coll)))
(defn two-largest [a b c] (sum-squares (drop-last (reverse [a b c]))))

