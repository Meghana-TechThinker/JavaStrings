import java.util.*;
public class PatternsPractice {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                //if(i+j+1==2*n-j)&&({
                if(j>i&&j<2*n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=2*n-1;j>=0;j--){
                //if(i+j+1==2*n-j)&&({
                if(j>i&&j<2*n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
