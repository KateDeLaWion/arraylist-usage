import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arraylist creates an expandable array class.
        // ArrayList creates an array class, not a regular array
        // so here list is an array class.

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        or
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list);
//        Or print in another way:
        for (int number : list) {
            System.out.println(number);
        }

        System.out.println(list.size());

// convert ArrayList to a regular array:
        Object[] arr = list.toArray();
        System.out.println("Elements of ArrayList in Array: " + Arrays.toString(arr));

        list.remove(0);
        System.out.println(list);

        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));

        System.out.println(list.contains(20));
        System.out.println(list.contains(15));

    }
}
