import java.util.*;
class EvenLength{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String[] s2=s.split(" ");
        //int n=obj.nextInt();
        for(int i=0;i<s2.length;i++){
            if(s2[i].length()%2==0){
                System.out.println(s2[i]);
            }
        }

    }
}