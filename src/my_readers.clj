(ns my-readers)

(defrecord Point [x y])

(defn read-point [v]
  (if (vector? v)
    (map->Point {:x (first v) :y (second v)})
    (throw (ex-info "Point literal expects a vector" {:value v}))))
