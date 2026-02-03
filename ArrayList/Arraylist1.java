package ArrayList;
import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(1);
        // list.add(3);
        // System.out.println(list);

        // int  element = list.get(2);
        // System.out.println(element);

        // list.remove(2);
        // System.out.println(list);

        // list.set(1,10);
        // System.out.println(list);

        // System.out.println(list.contains(1));


        list.add(0);
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list.size());

        //print the arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();


    }
    
}
