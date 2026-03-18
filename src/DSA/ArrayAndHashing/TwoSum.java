package DSA.ArrayAndHashing;

import java.util.Arrays;

public class TwoSum {
    public int [] Two(int[] a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int index=target-a[j];
                if(index==a[i]){

                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String [] args){
        int a=6;
        int [] arr={1,3,8,2,5};
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.Two(arr, a)));
    }
}
