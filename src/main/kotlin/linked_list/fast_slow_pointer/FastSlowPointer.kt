package linked_list.fast_slow_pointer

import linked_list.Node

class FastSlowPointer {

    fun middleNode(head: Node?): Node? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
    }



}
