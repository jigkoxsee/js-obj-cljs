# js-obj

[![Clojars Project](https://img.shields.io/clojars/v/jigkoxsee/js-obj.svg)](https://clojars.org/jigkoxsee/js-obj)  
A Clojure library to help convert custom js object to cljs data

## Usage

Some time you want to convert js-object to cljs data with `js->clj` but it doesn't work. Like this ...
```clojure
=> (js->clj (.-performance js/window))

#object[Performance [object Performance]]
```

With this library, you can do this ...

```clojure
=> (require '[js-obj.core :refer [obj->cljs]])
=> (obj->cljs (.-performance js/window))

{"clearMeasures" #object[clearMeasures],
 "onresourcetimingbufferfull" nil,
 "clearMarks" #object[clearMarks],
 "timeOrigin" 1527871319940.2368,
 "getEntriesByType" #object[getEntriesByType],
 "getEntriesByName" #object[getEntriesByName],
 "removeEventListener" #object[removeEventListener],
 "measure" #object[measure],
 "setResourceTimingBufferSize" #object[setResourceTimingBufferSize],
 "clearResourceTimings" #object[clearResourceTimings],
 "getEntries" #object[getEntries],
 "memory"
 {"totalJSHeapSize" 44700000,
  "usedJSHeapSize" 39600000,
  "jsHeapSizeLimit" 2190000000},
 "navigation"
 {"TYPE_NAVIGATE" 0,
  "TYPE_RELOAD" 1,
  "TYPE_BACK_FORWARD" 2,
  "TYPE_RESERVED" 255,
  "type" 0,
  "redirectCount" 0,
  "toJSON" #object[toJSON]},
 "dispatchEvent" #object[dispatchEvent],
 "now" #object[now],
 "addEventListener" #object[addEventListener],
 "mark" #object[mark],
 "timing"
 {"requestStart" 1527871319953,
  "domainLookupEnd" 1527871319949,
  "navigationStart" 1527871319940,
  "domContentLoadedEventEnd" 1527871320764,
  "domComplete" 1527871320915,
  "domLoading" 1527871320005,
  "connectEnd" 1527871319949,
  "domContentLoadedEventStart" 1527871320763,
  "loadEventStart" 1527871320915,
  "unloadEventStart" 0,
  "connectStart" 1527871319949,
  "redirectStart" 0,
  "domInteractive" 1527871320763,
  "domainLookupStart" 1527871319949,
  "redirectEnd" 0,
  "fetchStart" 1527871319949,
  "secureConnectionStart" 0,
  "responseStart" 1527871319977,
  "unloadEventEnd" 0,
  "responseEnd" 1527871320005,
  "loadEventEnd" 1527871320921,
  "toJSON" #object[toJSON]},
 "toJSON" #object[toJSON]}
```

## License

Copyright © 2018 Supakorn Warodom

Distributed under the MIT License
