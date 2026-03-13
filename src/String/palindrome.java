package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        //String s="madam";
        int l=0,r=s.length()-1;
        boolean isPalindrome = true;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }

        if (isPalindrome) {
            System.out.println("It is palindrome: " + s);
        } else {
            System.out.println("It is not palindrome");
        }
    }
}
