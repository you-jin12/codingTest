import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] state=new int[n]; //0으로 초기화
        Arrays.fill(state,-1);
        int count=0;
        
        while(n-->0){ //위치를 바꿨으면 count++;
            StringTokenizer st=new StringTokenizer(br.readLine());
            int cow=Integer.parseInt(st.nextToken());
            int location=Integer.parseInt(st.nextToken());
            
            
            if(state[cow-1]==-1){
                state[cow-1]=location;
            }
            else if(state[cow-1]!=location){
                count++;
                state[cow-1]=location;
            }
        }
        System.out.println(count);
    } 
}