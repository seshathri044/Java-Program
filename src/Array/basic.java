package Array;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int [] aaa ={2,6,5,4};
        int [] a= new int[5];
        a[0]=23;
        a[1]=34;
        //normal traversing
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+":arr");
        }
        for(int ac : a){
            System.out.println(ac+":a");
        }
        //max element
        int max=arr[0];
        for(int j = 0; j<arr.length; j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("max:"+max);
        //sum of array
        int sum=0;
        for(int jk=0;jk<arr.length;jk++){
            sum+=arr[jk];
        }
        System.out.println("sum:"+sum);
        //last element
        for(int jj=0;jj<arr.length;jj++){
            if(jj== arr.length-1){
                System.out.println("last new:"+arr[jj]);
            }
        }
        //get even number
        for(int ii=0;ii< arr.length;ii++){
            if(arr[ii]%2==0){
                System.out.println(arr[ii]);
            }
        }
        //get input from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number for array");
//        int y =sc.nextInt();
//        while (true){
//            int [] aa = new int[y];
//            aa = new int[]{sc.nextInt()};
//            System.out.println(aa+"array with user input:");
//        }
        //int [] arr={1,2,3,4};
        //int [] aaa ={2,3,4,5};
        int [] cc=new int[arr.length];
        int z=0;
        for(int kk=0;kk<=arr.length-1;kk++){
            for(int ll=0;ll<=kk;ll++){
                if(arr[kk]==aaa[ll]){
                  cc[z]=arr[kk];
                  z++;
                }
            }
        }
        System.out.print("compare: ");
        for (int i = 0; i <z; i++) {
            System.out.print(cc[i] + " ");
        }
        System.out.println("sort");
        int [] bc = new int[4];
        bc= Arrays.stream(aaa).sorted().toArray();
        System.out.println(Arrays.toString(bc));
        //count even and odd
        int even=0,odd=0;
        for(int ak=0;ak< aaa.length;ak++){
            if(aaa[ak]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even:"+even+"odd:"+odd);
        //sort manual
        int [] w={2,5,1,8,4,3};
        int temp=0;
        int ac=0,bb=0;
        for(int q=0;q<w.length-1;q++){
            for(int r=q+1;r<w.length-1;r++){
                if(w[q]<w[r]){
                    temp=w[q];
                    w[q]=w[r];
                    arr[r]=temp;
                }
            }
        }
        for(int num: arr){
            System.out.println(num);
        }
    }
}
