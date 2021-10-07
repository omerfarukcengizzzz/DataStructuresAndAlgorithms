public class CyberLinkedList {

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
}
