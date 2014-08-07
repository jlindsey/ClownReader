(defproject clownreader "0.1.0-SNAPSHOT"
  :description "Clojure Curses RSS Reader"
  :url "https://github.com/jlindsey/ClownReader"
  :license {:name "MIT License"
            :url "https://raw.githubusercontent.com/jlindsey/ClownReader/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot clownreader.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
