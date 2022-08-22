import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int max=-1000000;
        int min=1000000;
        int n,num;
        int t=Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                num=Integer.parseInt(st.nextToken());
                max=max<num?num:max;
                min=min>num?num:min;
            }
            System.out.println(min+" "+max);
            max=-1000000;
            min=1000000;
        }
        
    }
}