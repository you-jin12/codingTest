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
        Queue<Pair> queue=new LinkedList<Pair>();
        
        int[] dx={-1,-2,-2,-1,1,2,2,1};
        int[] dy={2,1,-1,-2,-2,-1,1,2};
        
        for(int i=0;i<test;i++){
            int l=Integer.parseInt(br.readLine());
            int[][] map=new int[l][l];
            
            for(int j=0;j<l;j++){
                for(int z=0;z<l;z++){
                    map[j][z]=-1;
                }
            }
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            map[x][y]=0;
            queue.add(new Pair(x,y));
            st=new StringTokenizer(br.readLine());
            int dx1=Integer.parseInt(st.nextToken()); //목적지 x
            int dy1=Integer.parseInt(st.nextToken()); //목적지 y
            
            while(!queue.isEmpty()){
                Pair pair=queue.poll();
                int px=pair.x;
                int py=pair.y;
                
                for(int dir=0;dir<8;dir++){
                    int nx=px+dx[dir];
                    int ny=py+dy[dir];
                    
                    if(nx<0 || ny<0 || nx>=l || ny>=l)
                        continue;
                    if(map[nx][ny]!=-1)
                        continue;
                    
                    map[nx][ny]=map[px][py]+1;
                    queue.add(new Pair(nx,ny));
                }
            }
            System.out.println(map[dx1][dy1]);
            queue.clear();
        }
    }
}