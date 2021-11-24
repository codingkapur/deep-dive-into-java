import java.util.*;

public class ArrayListExample {
    public static void main(String a[]) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        //ADD an Element
        list1.add(0);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        //GET an element
        System.out.println(list1.get(2));    
        //ADD element at specific index
        list1.add(1,5);
        System.out.println(list1);
        //SET element - change a preexisiting element;
        list1.set(0,9);
        System.out.println(list1);
        //DELETE element
        list1.remove(1);
        System.out.println(list1);
        //Count elements in an arraylist
        
        System.out.println(list1.size());

        //Sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}