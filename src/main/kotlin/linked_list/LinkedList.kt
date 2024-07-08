package linked_list

data class Node(val value: Int, var next: Node? = null)
data class DoubleNode(val value: Int, var prev: DoubleNode? = null, var next: DoubleNode? = null)

class LinkedList {

    fun createDoubleLinkedListHavingNNumbers(n: Int): DoubleNode {
        val head = DoubleNode(-1)
        val tail = DoubleNode(-1)
        head.next = tail
        tail.prev = head

        for (i in 0 until n) {
            val current = DoubleNode(i + 1)
            insertLastPosition(current, tail)
        }

        return head
    }

    private fun insertLastPosition(current: DoubleNode, tail: DoubleNode) {
        current.next = tail
        current.prev = tail.prev
        tail.prev!!.next = current
        tail.prev = current
    }
}