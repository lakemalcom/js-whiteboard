(ns js-whiteboard.whiteboard  
  (:require-macros [hiccups.core :refer [html]])
  (:require [domina :refer [by-id value by-class append! prepend! destroy! log]]
            [hiccups.runtime :as hiccupsrt]
        [domina.events :refer [listen! prevent-default]]))

(def ^export init []
  (let [canvas-div (by-id "canvasDiv")
        canvas (append! canvas-div (html [:canvas#canvas {:width "490" :height "220"}]))
        context (.getContext canvas "2d")]
    
    ))
