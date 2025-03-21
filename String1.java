import java.util.*;
public class String1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int n=s.length();
        if (s.length()>10){
            System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(n-1));
        }
        else{
            System.out.print(s);
        }
    }
}
