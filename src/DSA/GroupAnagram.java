package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
    // first we create boolean array
    //if visited means we will continue(skip the word)
    //if not then we add in group then check, if the two word is equal then combined in using ArrayList
    //if not the word will be considered separate list

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>result = new ArrayList<>();
        boolean [] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String>group=new ArrayList<>();
            if(visited[i])continue;
            group.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j< strs.length;j++){
                if(!visited[j]&&CheckAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }
    //using CheckAnagram we are validate two is Anagram or not
    public boolean CheckAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false; //if the length of two string is not equal then it is false
        char []c = s1.toCharArray();
        char []d = s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c,d);
    }
    public static void main(String [] args){
        GroupAnagram ga = new GroupAnagram();
        String [] s = {"cat","tac","mac","ace"};
        System.out.println(ga.groupAnagrams(s));
        //Time Complexity of this problem is:O(n^2)
        //Space Complexity of this problem is:O(n)

    }
}
