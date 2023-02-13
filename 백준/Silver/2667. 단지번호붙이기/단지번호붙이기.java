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
       int n=Integer.parseInt(br.readLine());
       int[][] map=new int[n][n];
       boolean[][] visit=new boolean[n][n];
       Queue<Pair> queue=new LinkedList<>();
       List<Integer>list=new ArrayList<>();
       int[] mx={0,1,0,-1};
       int[] my={-1,0,1,0};
       int count=0;
       
       for(int i=0;i<n;i++){
           String str=br.readLine();
           for(int j=0;j<n;j++){
               map[i][j]=str.charAt(j)-'0';
           }
       }
       
       
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
        	   
               if(map[i][j]==1 && !visit[i][j]){
                   queue.add(new Pair(i,j));
                   visit[i][j]=true;
                   int hCount=0;
                   
                   while(!queue.isEmpty()){
                       Pair pair=queue.poll();
                       int px=pair.x;
                       int py=pair.y;
                       hCount++;
                       
                       for(int dir=0;dir<4;dir++){
                           int nx=px+mx[dir];
                           int ny=py+my[dir];
                           
                           if(nx<0 || nx>=n || ny<0 || ny>=n){
                               continue;
                           }
                           if(map[nx][ny]==1 && !visit[nx][ny]){
                               queue.add(new Pair(nx,ny));
                               visit[nx][ny]=true;
                           }
                       }
                   }
                   count++;
                   list.add(hCount);
               }
           }
       }
       Collections.sort(list);
       System.out.println(count);
       for(Integer i:list){
           System.out.println(i);
       }
    }
}