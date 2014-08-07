(ns clownreader.utils
  (:require [clojure.tools.logging :as log]
            [clojure.string :as string])
  (:gen-class))

(defn error-msg
  "Returns a list of errors separated by newlines"
  [errors]
  (str "Errors:\n\n"
       (string/join \newline errors)))

(defn exit
  "Exits with the specified code and message"
  [status msg]
  (if (= status 0)
    (println msg)
    (if (instance? java.lang.Throwable msg)
      (do (log/fatal (.getMessage msg)) (.printStackTrace msg))
      (log/fatal msg)))
  (System/exit status))

