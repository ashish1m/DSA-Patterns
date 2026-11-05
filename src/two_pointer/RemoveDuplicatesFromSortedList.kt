package two_pointer

import util.ListNode
import util.appendNode

fun main() {
    val head = ListNode(1)
    head.appendNode(head, 3)
    head.appendNode(head, 5)
    head.appendNode(head, 7)
    head.appendNode(head, 11)
    head.appendNode(head, 15)


    var traverse = head
    while (traverse.next != null) {
        println(traverse.`val`)
        traverse = traverse.next!!
    }

    deleteDuplicates(head)
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var traverse: ListNode? = head
    var second: ListNode? = head
    while (traverse?.next != null) {
        if (traverse != head) {
            if (traverse.`val` == second?.`val`) {
                second.next = traverse.next
                traverse.next = null
                traverse = second.next
            } else {
                traverse = traverse.next
                second = second?.next
            }
        } else {
            traverse = traverse.next
        }
    }

    if (second?.next != null && second.`val` == traverse?.`val`) {
        second.next = null
    }

    return head
}
