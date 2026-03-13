package String;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s = "seshathriseshathriqwmwed";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            boolean visited = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(i) == s.charAt(k)) {
                    visited = true;
                    break;
                }
            }
            if (visited) continue;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(s.charAt(i) + " : " + count);
        }
    }
}
