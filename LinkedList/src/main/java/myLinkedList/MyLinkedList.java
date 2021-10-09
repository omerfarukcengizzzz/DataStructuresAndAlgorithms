package myLinkedList;

public class MyLinkedList {

    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head==null;
    }

    public void add(int item) {
        var node = new Node();

        node.data = item;
        node.next = null;

        if (isEmpty()) {
            head = tail = node;
        } else {
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
        }
        size++;
    }

    public void print() {
        var node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
