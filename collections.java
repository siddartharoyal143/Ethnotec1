import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5));

        System.out.println(set.contains(2));
        System.out.println(set.contains(5));
        System.out.println(set.remove(2));
        System.out.println(set);
    }
}