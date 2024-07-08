class MergeSort {

    /*
        Runing time O(nlogn)
        ruim para espaco
     */
    fun mergeSort(array: IntArray): IntArray {
        if (array.size <= 1) {
            return array
        }
        val mid = array.size / 2
        val leftArray = array.copyOfRange(0, mid)
        val rightArray = array.copyOfRange(mid, array.size)
        return merge(mergeSort(leftArray), mergeSort(rightArray))
    }

    private fun merge(leftArray: IntArray, rightArray: IntArray): IntArray {
        var i = 0
        var j = 0
        val sortedArray = mutableListOf<Int>()

        while (i < leftArray.size && j < rightArray.size) {
            if (leftArray[i] <= rightArray[j]) {
                sortedArray.add(leftArray[i])
                i++
            } else {
                sortedArray.add(rightArray[j])
                j++
            }
        }

        while (j < rightArray.size) {
            sortedArray.add(rightArray[j])
            j++
        }

        while (i < leftArray.size) {
            sortedArray.add(leftArray[i])
            i++
        }

        return sortedArray.toIntArray()
    }
}