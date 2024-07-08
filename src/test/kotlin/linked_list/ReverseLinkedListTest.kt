package linked_list

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReverseLinkedListTest {

    @Test
    fun reversingLinkedList() {
        val list = createLinkedListHavingNNodes(5)
        printLinkedList(list)
        val reversedList = ReverseLinkedList().reversingLinkedList(list)
        printLinkedList(reversedList)
    }

    private fun createLinkedListHavingNNodes(n: Int): Node {
        var count = 0
        val head = Node(0)
        var curr = head
        var loop = 0

        while (loop < n) {
            val nextNode = Node(++count)
            curr.next = nextNode
            curr = curr.next!!
            loop++
        }

        return head
    }

    private fun printLinkedList(list: Node?) {
        var curr: Node? = list
        while (curr != null) {
            print("${curr.value}, ")
            Int.MAX_VALUE
            curr = curr.next
        }
        println()
    }
}