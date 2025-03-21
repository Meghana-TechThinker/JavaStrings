
import java.util.*;                               //we are happy------>ew era yppah
public class Revers{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String M=obj.nextLine();
        //char ch[]=M.toCharArray();
        String[] t=M.split(" ");
        String res="";
        for(int i=0;i<M.length();i++){
            //System.out.print(ch[i]);
        //}
        //System.out.println();
    
            for(int j=t[i].length()-1;j>=0;j--){
            //System.out.println("reverse:");
                res=res+t[i].charAt(j);
            }
            System.out.print(res);
            
        }
    }
    
}
