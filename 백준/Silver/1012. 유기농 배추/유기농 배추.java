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
        
        int test=Integer.parseInt(br.readLine());
        int[][] map;
        boolean[][] visit;
        
        int[] dx={0,1,0,-1};
        int[] dy={-1,0,1,0};
        
        for(int i=0;i<test;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int m=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            int count=0;
            
            Queue<Pair> queue=new LinkedList<Pair>();
            map=new int[m][n];
            visit=new boolean[m][n];
            
            for(int j=0;j<k;j++){
                st=new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                map[x][y]=1;
            }
            
            for(int p=0;p<m;p++){
                for(int q=0;q<n;q++){
                    if(map[p][q]==1 && !visit[p][q]){
                        queue.add(new Pair(p,q));
                        visit[p][q]=true;
                        
                        while(!queue.isEmpty()){
                            Pair pair=queue.poll();
                            
                            int px=pair.x;
                            int py=pair.y;
                            
                            for(int dir=0;dir<4;dir++){
                                int nx=px+dx[dir];
                                int ny=py+dy[dir];
                                
                                if(nx<0 || ny<0 || nx>=m || ny>=n)
                                    continue;
                                if(map[nx][ny]==0 || visit[nx][ny])
                                    continue;
                                
                                queue.add(new Pair(nx,ny));
                                visit[nx][ny]=true;
                            }
                        }
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}