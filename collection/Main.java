
import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        List<Integer> list2= new LinkedList<>();

        list2.add(23);
        list2.add(12);
        list2.add(35);
        list2.add(78);

        System.out.println(list2);

        List<Integer> vector= new Vector<>();
        vector.add(45);
        vector.add(76);
        vector.add(23);
        vector.add(56);
        vector.add(63);

        System.out.println(vector);
    }
}