package String;

public class VowlesConstant {
    public static void main(String[] args) {
        String s = "ses45hathri9810";
        int vowels = 0;
        int consonants = 0;
        int digit=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            else if(ch >='0' && ch<='9'){
                digit++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digit:"+digit);
    }
}
