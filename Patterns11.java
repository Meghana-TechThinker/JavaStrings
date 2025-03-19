import java.util.*;
class Patterns11{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        /*int n=obj.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<=n-i-2;k++){
                System.out.print("  ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}