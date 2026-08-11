import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5));

        System.out.println(set.contains(2));
        System.out.println(set.contains(5));
        System.out.println(set.remove(2));
        System.out.println(set);
    }
}*/
HashSet<Integer> set = new HashSet<>();
HashSet<Integer> set2 = new HashSet<>();
for (int num:arr) {
    if (map.contains(num)) {
        map.put(num,map.get(num)+1);
    } else {
        map.put(num,1);
    }
    System.out.println(map);
}