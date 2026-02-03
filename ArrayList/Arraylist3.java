package ArrayList;
import java.util.ArrayList;

public class Arraylist3 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
       int temp = list.get(idx2);
       list.set(idx1, list.get(idx2));
       list.set(idx2, temp);

    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int isx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, isx1, idx2);
        System.out.println(list);
    }
    
}
