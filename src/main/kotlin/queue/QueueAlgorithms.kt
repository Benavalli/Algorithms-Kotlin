package queue

import linked_list.LinkedList

class QueueAlgorithms {

    fun play() {
        createJavaImpQueue(intArrayOf(1, 2, 3 ,4 , 5 ,6))
    }

    private fun createQueue(values: IntArray): Queue<Int> {
        val queue = Queue<Int>()
        values.forEach { value ->
            queue.enqueue(value)
        }
        queue.printQueue()
        return queue
    }

    private fun createJavaImpQueue(values: IntArray): java.util.LinkedList<Int> {
        val queue = java.util.LinkedList<Int>()
        values.forEach { value ->
            queue.offer(value)
        }
        queue.forEach {
            println(it)
        }
        println(queue.peek())
        return queue
    }
}
