(ns stasis_site.web-test
  (:require [stasis_site.web :refer :all]
            [midje.sweet :refer :all]))

(fact
 "All pages respond with 200 OK"

 (doseq [url (keys (get-pages))]
   (let [status (:status (app {:uri url}))]
     [url status] => [url 200])))
