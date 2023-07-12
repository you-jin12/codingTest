import java.io.*;
import java.util.*;

public class Main {
     public static int[][] bingo=new int[5][5];
     static int cnt=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int turn=0;

        for(int i=0;i<5;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                bingo[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0;i<5;i++){
            st=new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int num=Integer.parseInt(st.nextToken());
                turn++;

                check(num);
                col();
                row();
                diag1();
                diag2();
                
                if(cnt>=3){
                    break;
                }

                cnt=0;
            }
            if(cnt>=3){
                System.out.println(turn);
                break;
            }
        }
    }

    public static void check(int num){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(num==bingo[i][j]){
                    bingo[i][j]=0; 
                }
            }
        }
    }
    public static void col(){ //열체크

        for(int i=0;i<5;i++){
            int count=0;
            for(int j=0;j<5;j++){
                if(bingo[j][i]==0){
                    count++;
                    if(count==5){
                        cnt++;
                    }
                }
            }
        }
    }

    public static void row(){ //행체크

        for(int i=0;i<5;i++){
            int count=0;
            for(int j=0;j<5;j++){
                if(bingo[i][j]==0){
                    count++;
                    if(count==5){
                        cnt++;
                    }
                }
            }
        }
    }

    public static void diag1(){//왼쪽 대각선
        int count=0;
        for(int i=0;i<5;i++){
            if(bingo[i][i]==0){
                count++;
            }
            if(count==5){
                cnt++;
            }
        }
    }

    public static void diag2(){//오른쪽 대각선 체크

        int count=0;
        for(int i=0,j=4;i<5;i++,j--){
            if(bingo[i][j]==0){
                count++;
            }
            if(count==5){
                cnt++;
            }
        }
    }
}
