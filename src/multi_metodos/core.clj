(ns multi-metodos.core
  (:require [multi-metodos.executar :as exe]
            multi-metodos.email))

(defn -main []
  (println "Ola")
  (exe/run {:tipo :email}))
