import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int[][] D= new int[n+1][3];
        int[][] home=new int[n+1][3];
        
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            home[i][0]=Integer.parseInt(st.nextToken()); //R
            home[i][1]=Integer.parseInt(st.nextToken()); //G
            home[i][2]=Integer.parseInt(st.nextToken()); //B
        }

        D[1][0]=home[1][0]; // 1번째 집을 빨간색으로 칠할 경우 최소 비용
        D[1][1]=home[1][1]; // 2번째 집을 초록색으로 칠할 경우 최소 비용
        D[1][2]=home[1][2]; // 3번째 집을 파란색으로 칠할 경우 최소 비용
        
        for(int i=2;i<=n;i++){
            D[i][0]=Math.min(D[i-1][1],D[i-1][2])+home[i][0];
            D[i][1]=Math.min(D[i-1][0],D[i-1][2])+home[i][1];
            D[i][2]=Math.min(D[i-1][0],D[i-1][1])+home[i][2];
        }

        int result=Math.min(D[n][0],D[n][1]);
        if(result > D[n][2]){
            System.out.println(D[n][2]);
        }
        else{
            System.out.println(result);
        }
    }
}