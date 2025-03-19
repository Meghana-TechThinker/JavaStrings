import java.util.*;
class Practice{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        /*String s=new String("Hi");
        String s1=new String("Hi");
        System.out.println(s.equals(s1));
        String s3="";
        System.out.println(s3.isEmpty());*/
        
        //To print each letter
        /*String r="Welcome";
        char[] ch1=r.toCharArray();
        for(char c:ch1){
            System.out.println(c+" ");
        }
        System.out.println(Arrays.toString(ch1));*/



        //To replace a character with another character
        /*String s=obj.next();
        System.out.println("Enter 2 character");
        char ch1=obj.next().charAt(0);
        char ch2=obj.next().charAt(0);
        int n=s.length();
        char ch[] = s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]==ch1){
                ch[i]=ch2;
            }
        }System.out.print(ch);
        System.out.print(Arrays.toString(ch));*/

        //removing space
        /*String s=obj.nextLine();
        System.out.println("Enter a character");
        //char ch1=obj.next().charAt(0);
        int n=s.length();
        String s2="";
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]==' '){
                continue;
            }
            else{
                s2=s2+ch[i];
            }
        }
        System.out.print(s2);*/

        //reversing a sentence
        /*String s=obj.nextLine();
        //int n=s.length();
        //System.out.print(n);
        //String s2="";
        String [] T=s.split(" ");
        for(int i=T.length-1;i>=0;i--){
            System.out.print(T[i]+" ");
        }*/

        //converting firt letter of every word to capitals
        /*  String s=obj.nextLine();
        int n=s.length();
        char ch[]=s.toCharArray();
        String[] T=s.split(" ");
        String res="";
        for(int i=0;i<T.length;i++){
            //T[i]=T[i].substring(0,1).toUpperCase()+T[i].substring(1).toLowerCase();
            T[i]=Character.toUpperCase(T[i].charAt(0))+T[i].substring(1).toLowerCase();
        }
        for(int i=0;i<T.length;i++){
            res+=T[i]+" ";
        }
        System.out.print(res.trim());*/

        //String Palindrome
        /*String s=obj.next();
        int n=s.length();
        char ch[]=s.toCharArray();
        //String[] T=s.split(" ");
        //String res="";
        for(int i=0;i<n;i++){
            System.out.print(ch[i]);
        }
        String r="";
        for(int j=s.length()-1;j>=0;j--){
            r=r+ch[j];

        }
        if(s.equals(r)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }*/


        //Finding absolute difference blw ASCII values of string
        /*String s=obj.next();
        int n=s.length();
        int res=0;
        for(int i=0;i<n-1;i++){
            res+=Math.abs((int)(s.charAt(i))-(int)(s.charAt(i+1)));
           
        }
        System.out.print(res);*/


        //replacing . with [.]
        /*String s=obj.nextLine();
        System.out.println("Enter a character");
        String ch1="[.]";
        int n=s.length();
        String s2="";
        char z='.';

        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]==z){
                s2+=ch1;
            }
            else{
                s2+=ch[i];
            }
        }
        System.out.print(s2);*/


        /*int n=obj.nextInt();
        int c=0;
        while(n!=0){
            if(n%2==0){
                n=n/2;
                c++;
            }
            if(n%2!=0){
                n=n-1;
                c++;
            }
        }
        System.out.println("Count:"+c);*/

        //String reversing
        String M=obj.next();
        char ch[]=M.toCharArray();
        for(int i=0;i<M.length();i++){
            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.print("reverse:");
        for(int i=M.length()-1;i>=0;i--){
            //System.out.println("reverse:");
            System.out.print(ch[i]);
        }

    }
}