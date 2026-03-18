package DSA.ArrayAndHashing;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s1,String s2){

        int [] freq=new int[26];
        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        System.out.println(Arrays.toString(freq));
        for(char c: s2.toCharArray()){
            freq[c-'a']--;
        }

        System.out.println(Arrays.toString(freq));
        for(int num: freq){
            if(num==0){
                return true;
            }
        }
        return false;
        //Another method


    }
    public static void main(String [] args){
        Anagram an = new Anagram();
        String s1="cat";
        String s2="tac";
        System.out.println(an.isAnagram(s1,s2));
    }
}
