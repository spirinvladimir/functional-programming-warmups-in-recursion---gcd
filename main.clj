(loop [a (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))]
    (cond
        (reduce > a) (recur (list (reduce - a) (last a)))
        (reduce < a) (recur (list (- (reduce - a)) (first a)))
        :else (println (first a))))
