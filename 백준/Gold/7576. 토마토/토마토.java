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
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int m=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int no=0;
        int[][] box=new int[n][m];
        int[][] day=new int[n][m];//방문 표시와 날짜 세기를 동시에
        Queue<Pair>queue=new LinkedList<Pair>();
        
        int[] dx={0,1,0,-1};
        int[] dy={-1,0,1,0};
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                day[i][j]=-1;
                box[i][j]=Integer.parseInt(st.nextToken());
                
                if(box[i][j]==1){
                    queue.add(new Pair(i,j));
                    day[i][j]=0;
                }
                else if(box[i][j]==0){
                    no++;
                }
            }
        }
        
        if(no==0){
            System.out.print(0);
            System.exit(0);
        }
        
        
            int count=0;
            while(!queue.isEmpty()){
            
                Pair pair=queue.poll();
                int px=pair.x;
                int py=pair.y;
            
                for(int dir=0;dir<4;dir++){
                    int nx=px+dx[dir];
                    int ny=py+dy[dir];
                
                    if(nx<0 || ny<0 || nx>=n || ny>=m ){
                        continue;
                    }
                    if(box[nx][ny]==-1 || day[nx][ny]!=-1){//익은 토마토는 이미 방문을 했으므로
                        continue;
                    }
                    queue.add(new Pair(nx,ny));
                    no--;
                    day[nx][ny]=day[px][py]+1;
                    
                    if(count<day[nx][ny]){
                        count=day[nx][ny];
                    }
                }
            }
            
            if(no>0){
                System.out.print(-1);
            }
        else{
            System.out.print(count);
        }
       }
    }