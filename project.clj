(defproject cljs-bug "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :main cljs-bug.cli
  :profiles {:dev {:cljsbuild {:builds [{:source-paths ["src"]
                                         :compiler {:output-to "target/classes/public/app.js"
                                                    :output-dir "target/classes/public/out"
                                                    :main "cljs-bug.web"
                                                    :asset-path "target/classes/public/out"
                                                    :optimizations :none
                                                    :recompile-dependents true
                                                    :source-map true}}]}}})
