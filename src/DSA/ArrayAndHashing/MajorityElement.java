package DSA.ArrayAndHashing;

public class MajorityElement {
    public int Major(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String [] args){
        MajorityElement m = new MajorityElement();
        int [] nums = {1,3,3,3,4};
        System.out.println(m.Major(nums));
    }
}
