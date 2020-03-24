(defn double-the-number
  "Count the numbers from 1 up to X"
  [x]
  (+ x x))

(defn add
  "Count up the numbers x and y"
  [x y]
  (+ x y))

(defn count-numbers-using-recursion
  "Count all the numbers up to x using recursion"
  [x]
  (if (= x 1)
  (int 1)
    (int (+ x (count-numbers-using-recursion (- x 1)))))
)

(defn count-numbers-using-loop
  "Count all the numbers up to x using a for loop"
  [x]
  (def total 0)
  (loop [i 0]
    (when (<= i x)
          (def temptotal total)
          (ns-unmap 'user 'total)
          (def total (+ temptotal i))
          (recur (+ i 1))))
  (+ total 0)
  )

(defn count-numbers-using-atom
  "Count all the numbers up to x using atom datatype and for loop"
  [x]
  (def total (atom 0))

  (loop [i 0]
    (when (<= i x)
          (reset! total (+ @total i))
          (recur (+ i 1))))
  (reset! total @total)
  )
