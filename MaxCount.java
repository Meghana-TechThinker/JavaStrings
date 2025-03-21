import java.util.*;                                //sentences as strings//"hi"  "how are you"  "GM hi hello how r u"
class MaxCount{                                    // o/p: max:6, index:2
        public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s [i]=obj.nextLine();
        }
        int maxi=0,index=0;
        for(int i=0;i<n;i++){
            String str[]=s[i].split(" ");
            int m=str.length;
            if(maxi<m){
                maxi=m;
                index=i;
                
            }
        }

        System.out.println(maxi);
        System.out.println("index:"+index);
    }
}

        /*String T[]=s.split(",");
        for(int i=0;i<T.length;i++){
        char[] ch=s.toCharArray();*/