package String;

public class basic {
    public static void main(String[] args) {
        String s = "Seshathri";
        System.out.println("length"+s.length());
        System.out.println("char"+s.charAt(0));
        System.out.println("sub string:"+s.substring(1,4));
        System.out.println("charArray:"+s.toCharArray());
        System.out.println("equals"+s.equals("seshathri"));
        System.out.println("equals ignore case"+s.equalsIgnoreCase("seshathri"));
        System.out.println("traversing");
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println("reverse:");
        String a ="";
        for(int j =s.length()-1;j>=0;j--){
            a=a+s.charAt(j);
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}
