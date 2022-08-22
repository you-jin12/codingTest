import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        int result=fibo(n);
        System.out.print(result);
    }
    
    public static int fibo(int n){ //n번째 피보나치 수
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fibo(n-2)+fibo(n-1);
    }
}