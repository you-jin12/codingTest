import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n=Integer.parseInt(br.readLine());//삼각형 크기

        int[][] tri=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=i;j++){
                tri[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                tri[i][j]=Math.max(tri[i+1][j],tri[i+1][j+1])+tri[i][j];
            }
        }
        
        System.out.println(tri[1][1]);
    }
}