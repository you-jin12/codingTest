import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] score=new int[n+1];

        int[][] D=new int[n+1][2];

        for(int i=1;i<=n;i++){
            score[i]=Integer.parseInt(br.readLine());
        }
        
        D[1][0]=score[1];

        if(n==1){
            System.out.println(score[n]);
        }
        else{
            
            D[2][0]=score[2];
            D[2][1]=score[1]+score[2];
    
    
            for(int i=3;i<=n;i++){
                D[i][0]=Math.max(D[i-2][0],D[i-2][1])+score[i];
                D[i][1]=D[i-1][0]+score[i];
            }
    
            System.out.println(Math.max(D[n][0],D[n][1]));
        }
    }
}