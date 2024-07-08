package linked_list

import java.util.LinkedList

class ReverseLinkedList {

    fun reversingLinkedList(list: Node): Node? {
        var prev: Node? = null
        var curr: Node? = list

        while (curr != null) {
            var next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}
