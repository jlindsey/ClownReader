(defproject clownreader "0.1.0-SNAPSHOT"
  :description "Clojure Curses RSS Reader"
  :url "https://github.com/jlindsey/ClownReader"
  :license {:name "MIT License"
            :url "https://raw.githubusercontent.com/jlindsey/ClownReader/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.clojure/tools.logging "0.3.0"]
                 [clj-yaml "0.4.0"]
                 [clj-time "0.7.0"]
                 [clojure-lanterna "0.9.4"]
                 [feedparser-clj "0.2"]]
  :main ^:skip-aot clownreader.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
