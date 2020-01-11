(ns multi-metodos.sms
  (:require [multi-metodos.executar :as exe]))

(defmethod exe/run :default [_]
  (println "default"))