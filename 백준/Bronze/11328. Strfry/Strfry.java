import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int[] alpha=new int[26];
            char[] str1=sc.next().toCharArray();
            char[] str2=sc.next().toCharArray();
            for(int j=0;j<str1.length;j++){
                alpha[str1[j]-97]++;
            }
            for(int k=0;k<str2.length;k++){
                alpha[str2[k]-97]--;
            }
            boolean b=true;
            for(int q: alpha){
                if(q!=0) b=false;
            }
            System.out.println(b?"Possible" : "Impossible");
        }    
    }
}