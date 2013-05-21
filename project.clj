(defproject js-whiteboard "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj"]
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [domina "1.0.2-SNAPSHOT"]
                 [hiccups "0.2.0"]
                 ]
  :plugins  [
             [lein-cljsbuild "0.3.2"]
             [lein-ring "0.8.3"]
             ]
  :main js-whiteboard.core
  :ring {:handler js-whiteboard.core/handler}
  :cljsbuild {
    :builds [{
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src/cljs"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :output-to "resources/public/js/whiteboard.js"
          :optimizations :whitespace
          :pretty-print true}}]})
