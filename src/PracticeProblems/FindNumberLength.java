package PracticeProblems;

import java.util.Scanner;

public class FindNumberLength {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value:");
            int num = sc.nextInt();
            int count=0;
            while(num>0){
                num=num /10;
                count++;
            }System.out.println(" the length of the number:"+count);
            int c=6/10;
            System.out.println(c);
            sc.close();
    }
}
