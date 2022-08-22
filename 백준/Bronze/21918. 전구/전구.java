import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int a,b,c;
        int[] state=new int[n];
        
        st=new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++){
            state[i]=Integer.parseInt(st.nextToken());
        }
        
        while(m-->0){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken()); //몇번째 명령어인지
            b=Integer.parseInt(st.nextToken()); // a==1 경우 i/ a==2,3,4 경우 l
            c=Integer.parseInt(st.nextToken()); //a==1인 경우 x/ r
            
            if(a==1){
                state[b-1]=c;
            }
            else if(a==2){
                for(int i=b-1;i<=c-1;i++){
                    if(state[i]==0){
                        state[i]=1;
                    }
                    else state[i]=0;
                }
            }
            else if(a==3){
                for(int i=b-1;i<=c-1;i++){
                    state[i]=0;
                }
            }
            else if(a==4){
                for(int i=b-1;i<=c-1;i++){
                    state[i]=1;
                }
            }   
        }
        for(int i=0;i<n;i++){
            System.out.print(state[i]+" ");
        }
    }
}