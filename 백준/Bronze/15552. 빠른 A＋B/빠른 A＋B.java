import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int test=Integer.parseInt(br.readLine());
        
        for(int i=0;i<test;i++){
            st=new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }
        bw.flush();
        bw.close();
    }
}