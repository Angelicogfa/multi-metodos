(ns multi-metodos.email
  (:require [multi-metodos.executar :as exe]))

(defmethod exe/run :email [_]
  (println "Enviando email"))