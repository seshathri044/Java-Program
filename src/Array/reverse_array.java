package Array;
import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int [] arr = {2,4,6,9};
        int l=0,r= arr.length-1;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(l<r){
                temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
