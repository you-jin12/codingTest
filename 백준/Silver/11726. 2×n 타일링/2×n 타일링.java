import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        
        int[] D=new int[n+1];
        D[1]=1;



        if(n==1) System.out.println(D[n]);
        else if(n==2){
            D[2]=2;
            System.out.println(D[n]);
        }
        else{
            D[2]=2;
            for(int i=3;i<=n;i++){
                D[i]=((D[i-1]%10007)+(D[i-2]%10007))%10007;
            }
            System.out.println(D[n]);
        }
    }
}
