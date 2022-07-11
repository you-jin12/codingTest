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
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[][] map=new int[n][m];
        boolean[][] visit=new boolean[n][m];
        Queue<Pair> queue=new LinkedList<Pair>();
        int[] dx={0,1,0,-1};
        int[] dy={-1,0,1,0};
        
        for(int i=0;i<n;i++){
                String str=br.readLine();
            for(int j=0;j<m;j++){
                map[i][j]=str.charAt(j)-'0';
            }
        }
        
        visit[0][0]=true;
        queue.add(new Pair(0,0));
        while(!queue.isEmpty()){
            Pair p=queue.poll();
            int px=p.x;
            int py=p.y;
            
            for(int i=0;i<4;i++){
                int nx=px+dx[i];
                int ny=py+dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m){
                continue;
                }
                if(map[nx][ny]==0 || visit[nx][ny]==true){
                    continue;
                }
            
                queue.add(new Pair(nx,ny));
                map[nx][ny]=map[px][py]+1;
                visit[nx][ny]=true;
            }
        }
        System.out.println(map[n-1][m-1]);
    }
}