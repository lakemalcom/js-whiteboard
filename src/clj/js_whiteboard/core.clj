(ns js-whiteboard.core
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Sup?")
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (handler/site app-routes))
