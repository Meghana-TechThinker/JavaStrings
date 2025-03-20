import java.util.*;
class SortingArray{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        char[] ch=s.toCharArray();
        for(int i:ch){
            Arrays.sort(ch);
        }
        System.out.println(ch);
    }
}