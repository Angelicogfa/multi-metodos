(ns multi-metodos.notificacao
  (:require [multi-metodos.executar :as exe]))

(defmethod exe/run :notificacao [_]
  (println "Enviando notificacao"))