(defn quicksort
  "Quicksort"
  ([arr]
   (if (> (count arr) 0)
     (do
       (def pivot (nth arr 0))
       (def -rest (rest arr))
       (quicksort -rest pivot))
     )
   )
  ([arr p]
   (concat (quicksort (filter #(>= p %) arr)) [p] (quicksort (filter #(< p %) arr))))
  )

