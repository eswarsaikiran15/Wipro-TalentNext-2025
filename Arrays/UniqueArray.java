package Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.print("{");
        int count = 0;
        for (int num : set) {
            System.out.print(num);
            count++;
            if (count < set.size()) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}