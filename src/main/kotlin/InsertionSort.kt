class InsertionSort {

    /*
        Insertion Sort is good for small arrays, is also good in space
        O(n^2) running worst case
        O(1) space, it is excellent when memory is a concern
     */
    fun insertionSortAsc(array: IntArray): IntArray {
       for (i in 1..<array.size) {
           val key = array[i]
           var j = i - 1
           while (j >= 0 && array[j] > key) {
               array[j + 1] = array[j]
               j--
           }
           array[j + 1] = key
       }
       return array
    }

    fun insertionSortDesc(array: IntArray): IntArray {
        for (i in 1..<array.size) {
            val key = array[i]
            var pivot = i - 1
            while (pivot >= 0 && array[pivot] < key) {
                array[pivot + 1] = array[pivot]
                pivot--
            }
            array[pivot + 1] = key
        }
        return array
    }
}