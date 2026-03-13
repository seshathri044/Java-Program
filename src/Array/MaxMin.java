package Array;

public class MaxMin {
    public static void main(String[] args) {
        int [] arr = {2,4,6,1,3,9};
        int min= arr.length-1;
        int max=arr.length-1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min=j;
            }
        }
        System.out.println("max:"+max+ "  min:"+min);
        //second largest number


                int[] arr1 = {2, 4, 6, 1, 3, 9};

                int largest = Integer.MIN_VALUE;
                int secondLargest = Integer.MIN_VALUE;

                for (int num : arr1) {
                    if (num > largest) {
                        secondLargest = largest;
                        largest = num;
                    }
                    else if (num > secondLargest && num != largest) {
                        secondLargest = num;
                    }
                }

                System.out.println("Second largest: " + secondLargest);
                //another style same way in for each and simple changes
        int [] nums ={2,4,6,1,3,9,7};
        int second=0;
        for (int num : nums) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }
        System.out.println(second);

    }

}
