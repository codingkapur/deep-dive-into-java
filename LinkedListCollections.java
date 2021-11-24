import java.util.*;

public class LinkedListCollections {

    public static void main(String a[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("LinkedList");
        list.add("Hey"); // By default, the element is added in the last.

        System.out.println(list);
        //Print the size of the linked list.
        System.out.println(list.size()); //list.size() function
        //Iterate over the list and print all elements.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //list.get(index) method.
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(1); //Remove a  element at a given index;
        System.out.println(list);

    }
}