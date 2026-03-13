package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int l=0,r=arr.length-1;
        System.out.println("Enter the search value:");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        sc.close();
        int mid=0;
        while(l<r){
            mid=l+(l+r)/2;
            if(search==arr[mid]){
                System.out.println("element found:"+search);
                break;
            } else if (search<arr[mid]) {
                r=mid;
                l=0;
                //mid=l+(l+r)/2;
                //System.out.println("element found:"+search);
            } else if (search>arr[mid]) {
                l=mid;
                r=arr.length;
                //mid=l+(l+r)/2;
            }
        }

    }
}
