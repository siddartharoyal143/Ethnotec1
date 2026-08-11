import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);

        System.out.println("List is : " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Removed element: " + list.remove(2));
    }
}
