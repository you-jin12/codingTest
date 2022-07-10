import java.io.*;
import java.util.*;


class Pair{ // i(n),j(m)
    int w,h;
    
    public Pair(int w,int h){
        this.w=w;
        this.h=h;
    }
}
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String strr=br.readLine();
        int n=Integer.parseInt(strr.split(" ")[0]);
        int m=Integer.parseInt(strr.split(" ")[1]);
        
        int count=0;
        int picMax=0;
        Pair pair;
        Queue<Pair> queue=new LinkedList<Pair>();
        int[][] pic=new int[n][m];
        boolean[][] visit=new boolean[n][m];
        int[] dx={0,1,0,-1};
        int[] dy={-1,0,1,0};
        
        for(int i=0;i<n;i++){
            String str=br.readLine();
            StringTokenizer st=new StringTokenizer(str," ");
            for(int j=0;j<m;j++){
                pic[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pic[i][j]==1 && !visit[i][j]){
                    
                    queue.add(new Pair(i,j));//
                    count++;//
                    visit[i][j]=true; //
                    int width=1; //
                    
                    while(!queue.isEmpty()){
                        
                        pair=queue.poll();
                        
                        for(int dir=0;dir<4;dir++){
                            int nx=pair.w+dx[dir];
                            int ny=pair.h+dy[dir];
                            
                            if(nx<0 || ny<0 || nx>=n || ny>=m){
                                continue;
                            }
                            if(visit[nx][ny] || pic[nx][ny]==0){
                                continue;
                            }
                            visit[nx][ny]=true;
                            queue.add(new Pair(nx,ny));
                            width++;
                            
                        }
                    }
                    
                    if(picMax<width){
                        picMax=width;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(picMax);
    }   
}