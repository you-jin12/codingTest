import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[] D=new long[n+1];
        D[1]=1;
        long count=1;

        for(int i=2;i<=n;i++){
            D[i]=(D[i-1]-count)*2+count;
            count=D[i-1]-count;
        }

        System.out.println(D[n]);
    }
}