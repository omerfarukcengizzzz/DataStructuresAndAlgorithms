package myLinkedList;

public class Runner {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        System.out.println(linkedList.isEmpty());
        linkedList.add(18);
        linkedList.add(24);
        linkedList.add(3);
        linkedList.print();
        linkedList.getSize();


    }
}
