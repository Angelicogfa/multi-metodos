(ns multi-metodos.executar)

(defmulti run (fn [ctx]
                (:tipo ctx)))