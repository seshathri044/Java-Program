package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "seshathri";
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (char ch : set) {
            System.out.print(ch);
        }
    }
}
