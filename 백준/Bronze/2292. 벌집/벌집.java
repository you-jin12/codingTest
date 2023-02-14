import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int sum=1;
        int count=1;
        int range=6;

        if(n==1){
            System.out.println(1);
        }
        else{

            while(sum<n){
                sum=sum+range;
                range=range+6;
                count++;
            }
            System.out.println(count);
        }
    }
}