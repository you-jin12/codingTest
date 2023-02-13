import java.util.*;
import java.io.*;

class Pair{
    int x,y;
    
    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Main{
       public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int n=Integer.parseInt(br.readLine());
       int[][] map=new int[n][n];
       boolean[][] visit=new boolean[n][n];
       Queue<Pair> queue=new LinkedList<>();
       int[] dx={0,1,0,-1};
       int[] dy={1,0,-1,0};
       int safe=0;
       int count=0;
       for(int i=0;i<n;i++){
           st=new StringTokenizer(br.readLine());
           for(int j=0;j<n;j++){
               map[i][j]=Integer.parseInt(st.nextToken());
           }
       }
       
       for(int h=0;h<=100;h++){
           if(count>safe) {
               safe=count;
           }
           count=0;
           queue.clear();
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
            	   
                   if(map[i][j]>h && !visit[i][j]){
                       queue.add(new Pair(i,j));
                       visit[i][j]=true;
                       
                       while(!queue.isEmpty()){
                           Pair pair=queue.poll();
                           
                           int px=pair.x;
                           int py=pair.y;
                           
                           for(int dir=0;dir<4;dir++){
                               int nx=px+dx[dir];
                               int ny=py+dy[dir];
                               
                               if(nx<0 || nx>=n || ny<0 || ny>=n){
                                   continue;
                               }
                               if(map[nx][ny]>h && !visit[nx][ny]){
                                   queue.add(new Pair(nx,ny));
                                   visit[nx][ny]=true;
                               }
                           }
                       }   
                       count++;
                   }
               }
           }
           visit=new boolean[n][n];
       }
       System.out.println(safe);
   }
}