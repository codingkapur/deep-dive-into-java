public class LinkedListScratch {

    Node head;
    private int size;
    LinkedListScratch(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // OPERATIONS
    // ---ADD--- FIRST
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // ---ADD--- FIRST/LAST
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // ---DELETE--- FIRST

    public void deleteFirst() {
        if(head == null){
            System.out.println("The list is empty!");
            return;
        }
        size--;
        head = head.next;
    }

    // ---DELETE--- LAST
    public void deleteLast() {
        if(head == null){
            System.out.println("The list is empty!");
            return;
        }
        size--;

        if(head.next == null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String a[]) {
        LinkedListScratch list = new LinkedListScratch();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());


    }
}