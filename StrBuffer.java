import java.util.*;
class StrBuffer{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StringBuffer sb=new StringBuffer("Hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(5," ");
        System.out.println("insert: "+sb);
        int s1=sb.length();
        System.out.println("length:"+s1);
        StringBuffer s2=sb.reverse();
        System.out.println("reverse:"+s2);
        sb.reverse();
        sb.delete(0,5);
        System.out.println("delete:"+sb);
        sb.setCharAt(0,'S');
        System.out.println("setcharat:"+sb);
        sb.replace(0,5,"Hello");
        System.out.println("replace:"+sb);
        sb.deleteCharAt(0);
        System.out.println("deletecharat:"+sb);
        
        /*StringBuffer s2=sb.reverse();
        System.out.println(s2);
        sb.reverse();
        System.out.println(sb);
        sb.delete(4,6);
        System.out.println(sb);*/

        /*String s="abc";
        int n=s.length();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
            //System.out.println(s.substring(i));
            }
        */
        /*int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }*/
    }
}