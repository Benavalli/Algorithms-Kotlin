package linked_list.reversing_deleting

import linked_list.Node

class ReversingDeleting {

    fun deleteDuplicates(head: Node?): Node? {
        var dummy = head

        while (dummy?.next != null) {
            val currValue = dummy.value
            val nextValue = dummy.next?.value
            if (currValue == nextValue) {
                dummy.next = dummy.next?.next
            } else {
                dummy = dummy.next
            }
        }

        return head
    }

    fun deleteDuplicatesWhileVersion(head: Node?): Node? {

        var curr = head

        while (curr != null) {

            while (curr.value == curr.next?.value) {
                curr.next = curr.next?.next
            }

            curr = curr.next
        }

        return head
    }

    fun reversingList(head: Node?): Node? {
        var prev: Node? = null
        var curr = head

        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}