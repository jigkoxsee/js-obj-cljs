(ns js-obj.core
  (:require [goog.object :as gobj]))

(defn obj->cljs
  ([obj]
   (obj->cljs obj false))
  ([obj keywordize-keys]
   (case (goog/typeOf obj)
     "array"
     (into []
           (for [i obj]
             (obj->cljs i keywordize-keys)))
     "object"
     (into {}
           (for [k (gobj/getKeys obj)]
             (let [v (gobj/get obj k)
                   new-k (if keywordize-keys (keyword k) k)]
               (if-not (some #{(goog/typeOf v)} ["array" "object"])
                 [new-k v]
                 [new-k (obj->cljs v keywordize-keys)]))))
     obj)))

