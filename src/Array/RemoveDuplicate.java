package Array;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 2};

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);

    }
}