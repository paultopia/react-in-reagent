(ns reactinreagent.core
    (:require [reagent.core :as reagent]))

;; -------------------------
;; Views

(defn home-page []
  (let [react-datasheet (aget js/window "ReactDatasheet")]
    [:div
     [:h2 "Hmm.?"]
     [:> react-datasheet {:data (clj->js [[{"value" "1"} {"value" "2"}
                                           {"value" "3"} {"value" "4"}]])}]]))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))

