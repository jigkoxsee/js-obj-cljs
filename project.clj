(defproject jigkoxsee/js-obj "0.1.5"
  :description "Help for convert typed js object to cljs data"
  :url "https://github.com/jigkoxsee/js-obj-cljs"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]])
