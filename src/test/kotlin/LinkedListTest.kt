import linked_list.LinkedList
import org.junit.jupiter.api.Test

class LinkedListTest {

    @Test
    fun createDoubleLinkedListHavingNNumbers() {
        val doubleLinkedList = LinkedList().createDoubleLinkedListHavingNNumbers(5)
        var current = doubleLinkedList.next
        while (current != null) {
            println(current.value)
            current =  current.next
        }
    }
}