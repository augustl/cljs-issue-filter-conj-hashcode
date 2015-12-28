(ns cljs-bug.cli
  (:require [cljs-bug.bug :as bug]))

(defn -main [& args]
  (bug/demonstrate))


