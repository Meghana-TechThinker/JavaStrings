import java.util.*;
public class LowerUpper {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int n=s.length();
        char ch[]=s.toCharArray();
        //String s1="";
        for(int i=0;i<n;i++){
            char ch1=ch[i];
            if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i]=Character.toLowerCase(ch1);
            }
            //if(ch[i]>='a'&&ch[i]<='z'){
            else{
                ch[i]=Character.toUpperCase(ch1);
            }
            System.out.print(ch[i]);
        }
    }

}
