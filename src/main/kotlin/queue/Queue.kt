package queue

class Queue<T> {

    data class QueueNode<T>(var value: T, var next: QueueNode<T>? = null)

    private var start: QueueNode<T>? = null
    private var end: QueueNode<T>? = null

    fun enqueue(value: T) {
        val currentNode = QueueNode(value)
        start?.let {
            currentNode.next = start
            start = currentNode
        } ?: run {
            start = currentNode
            end = currentNode
        }
    }

    fun dequeue(): T? {
        var value: T? = null
        end?.let {
            value = it.value
            end = it.next
        }

        if (end == null) {
            start = null
        }
        
        return value
    }

    fun peek(): T? {
        var value: T? = null
        end?.let {
            value = it.value
        }
        return value
    }

    fun printQueue() {
        var dummy = start
        while (dummy != null) {
            println(dummy.value)
            dummy = dummy.next
        }
    }
}
