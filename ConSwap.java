import java.util.*;
public class ConSwap {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        char[] ch=s.toCharArray();
        //int c=0;
        for(int i=0;i<s.length();i++){
            if(i%2==1){
                char temp=ch[i-1];
                ch[i-1]=ch[i];
                ch[i]=temp;
            }
        }

    System.out.println(ch);
    }

}
