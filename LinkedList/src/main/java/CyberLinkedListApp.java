public class CyberLinkedListApp {
    public static void main(String[] args) {

        var cyberLinkedList = new CyberLinkedList();

        cyberLinkedList.addLast(1);
        cyberLinkedList.addLast(2);
        cyberLinkedList.addLast(3);
        cyberLinkedList.printLinkedList();

        cyberLinkedList.deleteLast();

    }
}
