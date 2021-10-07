import java.util.NoSuchElementException;

public class CyberLinkedList {

    // Node Class
    public class Node {
        public int value;
        public Node next;   // pointer (address) for the next Node object

        // constructor with value parameter
        public Node(int value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    public int size;

    // when ever the CyberLinkedList object is created
    // the initial values for the parameters will be set
    public CyberLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // Methods
    public boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        var node = new Node(item);
        System.out.println("adding an item: " + item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void deleteLast() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var previous = first;
            var current = first;

            while (current.next != null) {
                previous = current;
                current = current.next;
            }

            previous.next = null;
            last = previous;
        }

    }

}
