(ns multi-metodos.core
  (:require [multi-metodos.executar :as exe]))

(defn -main []
  (println "Ola")
  (exe/run {:tipo :email}))