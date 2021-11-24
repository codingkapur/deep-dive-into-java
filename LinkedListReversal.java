
public class LinkedListReversal {

    private int size;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;

    public void addNodeFirst(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            System.out.println(element + " was successfully added to the list!");
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println(element + " was successfully added to the list!");

    }

    public void addNodeLast(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            System.out.println(element + " was successfully added to the list!");
            return;
        }
        if (head.next == null) {
            head.next = newNode;
            System.out.println(element + " was successfully added to the list!");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        System.out.println(element + " was successfully added to the list!");
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty, buddy.");
            return;
        }
        Node currNode = head;
        System.out.println("Printing List: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public void reverseList() {
        if (head == null) {
            System.out.println("List is empty, buddy!");
        }
        if (head.next == null) {
            System.out.println("There is only one element in the list. Reversed! Boom!");
        }
        System.out.println("Reversing List!!");

        Node prevNode = head;
        Node currNode = head.next;

        while ( currNode != null) {

            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

            //Login attempt #2
            // nextNode = head.next;
            // head.next = prevNode;
            // prevNode = head;
            // head = nextNode;
            // Logic attempt 1
            // currNode = head.next;
            // nextNode = currNode.next;
            // head.next = prevNode;
            // prevNode = head;
            // head = currNode;
        }
        head.next =null;
        head = prevNode;
    }

    public static void main(String a[]) {
        LinkedListReversal list1 = new LinkedListReversal();
        list1.printList();

        list1.addNodeLast(2);
        list1.printList();

        list1.addNodeFirst(1);

        list1.printList();
        list1.addNodeLast(3);
        list1.addNodeLast(4);
        list1.addNodeLast(5);

        list1.printList();
        list1.reverseList();
        list1.printList();

    }
}