public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Step 1: Create new node
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    // Step 2: If inserting at head
    if (position == 0) {
        newNode.next = llist;
        return newNode;
    }

    // Step 3: Traverse to (position - 1)th node
    SinglyLinkedListNode current = llist;
    for (int i = 0; i < position - 1; i++) {
        current = current.next;
    }

    // Step 4: Insert node
    newNode.next = current.next;
    current.next = newNode;

    // Step 5: Return head (original)
    return llist;
}
