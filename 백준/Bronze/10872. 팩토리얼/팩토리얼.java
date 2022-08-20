import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int result=fac(Integer.parseInt(br.readLine()));
        System.out.println(result);
    }
    public static int fac(int n){
        if(n<=1)return 1;
        return n*fac(n-1);
    }
}