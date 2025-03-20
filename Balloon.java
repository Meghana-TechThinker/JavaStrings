import java.util.*;
public class Balloon{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        char[]ch=s.toCharArray();
        int c=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<s.length();i++){
            if (ch[i]=='b'){
                c++;
            }
            if(ch[i]=='a'){
                a++;
            }
            if(ch[i]=='l'){
                l++;
            }
            if(ch[i]=='o'){
                o++;
            }
            if(ch[i]=='n'){
                n++;
            }
        }
        System.out.println("b:"+c);
        System.out.println("a:"+a);
        System.out.println("l:"+l/2);
        System.out.println("o:"+o/2);
        System.out.println("n:"+n);
        int r[]={c,a,l/2,o/2,n};
        int min=r[0];
        for(int i=0;i<n;i++){
            if(r[i]<min){
                min=r[i];
            }
         }
        System.out.print("count: "+min);
    }
}

