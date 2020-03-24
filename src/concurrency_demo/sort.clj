(defn bubble-sort
  "Apply bubble sort on given array"
  ([arr]
  (bubble-sort arr (count arr)))
  ([arr n]
  (if (>= n 1)
    (do
      (loop [i 0]
        (when (< i (- n 1))
              (def next (+ i 1))
              (when (> (nth arr i) (nth arr next))
                (assoc arr i (arr next) next (arr i))
                (bubble-sort arr (- (count arr) 1))
              (recur (+ i 1)))
        )
      )
    )
  )
 )
)
