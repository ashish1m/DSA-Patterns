package util

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun ListNode.appendNode(head: ListNode, `val`: Int): ListNode {
    val newNode = ListNode(`val`)
    var traverse = head

    while (traverse.next != null) {
        traverse = traverse.next!!
    }
    traverse.next = ListNode(`val`)
    return head
}

fun ListNode.prependNode(head: ListNode, `val`:Int): ListNode {
    val newNode = ListNode(`val`)
    newNode.next = head
    return newNode
}