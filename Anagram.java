import java.util.*;
class Anagram{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        String t=obj.next();
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        String res="";
        String res1="";
        for(int i:ch){
           Arrays.sort(ch);
        }
        for(int j:ch1){
            Arrays.sort(ch1);
         }

        System.out.println(ch);
        System.out.println(ch1);
        if(Arrays.equals(ch,ch1)){
            System.out.println("True");
        } else{
            System.out.println("false");
        }
    }
}