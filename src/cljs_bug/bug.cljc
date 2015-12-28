(ns cljs-bug.bug)

(defn demonstrate []
  (let [log (fn [xs]
              (prn (hash xs) (count xs))
              xs)]
    (-> []
        (conj 1)
        (conj 2)
        log
        (->> (remove #{1}))
        log
        (->> (remove #{2}))
        log
        (conj 3)
        log
        (conj 4)
        log
        (conj 5)
        log)))
