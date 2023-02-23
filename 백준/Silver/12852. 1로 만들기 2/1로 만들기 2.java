import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
         int[] D=new int[n+1];
         int[] cir=new int[n+1];
         D[0]=D[1]=0;

         for(int i=2;i<=n;i++){
            D[i]=D[i-1]+1;
            cir[i]=i-1;
            if(i%2==0 && (D[i]>(D[i/2]+1))){
                D[i]=D[i/2]+1;
                cir[i]=i/2;
            }
            if(i%3==0 && (D[i]>(D[i/3]+1))){
                D[i]=D[i/3]+1;
                cir[i]=i/3;
            }

         }
         String result="";

         System.out.println(D[n]);
         while(n>=1){
            result=result+""+n+" ";
            n=cir[n];
         }

         System.out.println(result);
    }
}