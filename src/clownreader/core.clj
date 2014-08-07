(ns clownreader.core
  (:require [clojure.tools.logging :as log]
            [clojure.tools.cli :refer [parse-opts]]
            [clojure.java.io :refer [file]]
            [clojure.string :as string]
            [clownreader.utils :as utils])
  (:gen-class))

(def cli-options
  [["-d" "--directory" "Directory to load configs and cache from. Defaults to ~/.clownreader"
    :default (file (.. System (getProperty "user.home")) ".clownreader")
    :parse-fn #(file %)]
   ["-h" "--help" "Display this help"]])

(defn- usage
  "Returns the usage banner as a string"
  [options]
  (->> ["A simple RSS/Atom feed reader"
        ""
        options]
       (string/join \newline)))

(defn -main
  "Entrypoint method"
  [& args]
  (let [{:keys [options arguments errors summary]} (parse-opts args cli-options)]
    (cond
      (:help options) (utils/exit 0 (usage summary))
      errors (utils/exit 1 (utils/error-msg errors)))))

