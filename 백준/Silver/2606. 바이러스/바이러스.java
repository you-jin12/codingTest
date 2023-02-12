import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> queue=new LinkedList<>();
        
        int computer=Integer.parseInt(br.readLine());
        int pair=Integer.parseInt(br.readLine());
        int[][] map=new int[computer+1][computer+1];
        boolean[] visit=new boolean[computer+1];
        int count=0;
        
        for(int i=0;i<pair;i++){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            map[n][m]=1;
            map[m][n]=1;
        }
        queue.offer(1);
        visit[1]=true;
        while(!queue.isEmpty()){
            int temp=queue.poll();
            
            for(int i=1;i<=computer;i++){
                if(map[temp][i]==1 && visit[i]==false){
                    queue.offer(i);
                    visit[i]=true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}