package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {


        int [] arr={2,5,7,9,1};
        System.out.println("enter the search element");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            //for(int j=0;j<i;j++){
                if(arr[i]==search){
                    System.out.println("element found:"+arr[i]);
                }
            //}
        }
    }
}
