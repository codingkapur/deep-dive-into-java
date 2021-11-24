import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo{
    public static void main(String a[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        //Creating an iterator
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + "|");
        }
        System.out.println();
        //ForEach method
        for(Integer obj:list1){
            System.out.print(obj + "|");
        }
        System.out.println();
        //Regular for approach
        for(int i =0;i<list1.size();i++){
            System.out.print(list1.get(i) + "|");
        }
    }
}