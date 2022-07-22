import java.io.*;
import java.util.*;

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
        int count=0;
        int count2=0; //적록색약 O
        
        int[] dx={0,1,0,-1};
        int[] dy={-1,0,1,0};
        
        char[][] map=new char[n][n]; //적록색약 X
        boolean[][] visit=new boolean[n][n];
        Queue<Pair>queue=new LinkedList<Pair>();
        
        for(int i=0;i<n;i++){
            String str=br.readLine();
            for(int j=0;j<n;j++){
                map[i][j]=str.charAt(j);
            }
        }
        
        
        for(int p=0;p<n;p++){
            for(int q=0;q<n;q++){
                if(!visit[p][q]){
                    queue.add(new Pair(p,q));
                    count++;
                    visit[p][q]=true;
                }
                while(!queue.isEmpty()){
                   Pair pair=queue.poll();
                   int px=pair.x;
                   int py=pair.y;
            
                    for(int dir=0;dir<4;dir++){
                        int nx=px+dx[dir];
                        int ny=py+dy[dir];
                
                        if(nx<0 || ny<0 || nx>=n || ny>=n)
                            continue;
                        if(map[px][py]!=map[nx][ny])
                            continue;
                        if(visit[nx][ny])
                            continue;
                        visit[nx][ny]=true;
                        queue.add(new Pair(nx,ny));
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){ //바꾸는 작업
            for(int j=0;j<n;j++){
                visit[i][j]=false;
                if(map[i][j]=='G')
                    map[i][j]='R';
            }
        }
        
        Queue<Pair> queue2=new LinkedList<Pair>();
        
        for(int k=0;k<n;k++){
            for(int t=0;t<n;t++){
                if(!visit[k][t]){
                    visit[k][t]=true;
                    count2++;
                    queue2.add(new Pair(k,t));
                }
                while(!queue2.isEmpty()){
                    Pair pair2=queue2.poll();
                    int px=pair2.x;
                    int py=pair2.y;
                    
                    for(int dir=0;dir<4;dir++){
                        int nx=px+dx[dir];
                        int ny=py+dy[dir];
                        
                        if(nx<0 || ny<0 || nx>=n || ny>=n)
                            continue;
                        if(map[px][py]!=map[nx][ny])
                            continue;
                        if(visit[nx][ny])
                            continue;
                        visit[nx][ny]=true;
                        queue2.add(new Pair(nx,ny));
                    }
                }
            }
        }
        System.out.println(count+" "+count2);
    }
}