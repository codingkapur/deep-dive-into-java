public class LinkedListScratchExercise {
    
    private int size;

    LinkedListScratchExercise(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!= null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked List is empty!");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode.next = lastNode;
            secondLast.next = secondLast;
        }
        secondLast.next= null;
    }
    public void searchList(int element){
        if(head==null){
            System.out.println("The list is empty! Element does not exist");
            return;
        }
        Node currNode = head;
        int count= 0;
        while(currNode != null){
            if(currNode.data == element){
                System.out.println("Element is at index "+ count);
                return;
            }
            currNode = currNode.next;
            count++;

        }
    }
    public void getSize(){
        System.out.println("The size of the list is "+ size);
    }
    public void printList(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String a[]) {
        LinkedListScratchExercise list = new LinkedListScratchExercise();
        list.addFirst(1);
        list.addFirst(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        list.searchList(7);
        list.getSize();
        list.deleteFirst();
        list.printList();
        list.getSize();

    }
}