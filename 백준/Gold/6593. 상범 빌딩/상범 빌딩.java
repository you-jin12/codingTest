import java.util.*;
import java.io.*;

class Point{
    int x,y,z;
    public Point(int z,int x,int y){
        this.x=x; //행
        this.y=y; //열
        this.z=z; //층
    }
}

public class Main {

    static char[][][] map;
    static int[][][] minute;
    static boolean[][][] visit;
    static Queue<Point> queue;
    static int[] dx={0,0,0,0,1,-1};
    static int[] dy={0,0,1,-1,0,0};
    static int[] dz={1,-1,0,0,0,0};

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){

            StringTokenizer st=new StringTokenizer(br.readLine());
        
            int l=Integer.parseInt(st.nextToken());//층
            int r=Integer.parseInt(st.nextToken());//행
            int c=Integer.parseInt(st.nextToken());//열
    
            map=new char[l][r][c];
            visit=new boolean[l][r][c];
            queue=new LinkedList<>();
            minute=new int[l][r][c];

            for(int i=0;i<l;i++){ //층
                for(int j=0;j<r;j++){ //행
                    String str=br.readLine();
                    for(int z=0;z<c;z++){//열
                        map[i][j][z]=str.charAt(z);
                        
                        if(str.charAt(z) == 'S'){
                            queue.add(new Point(i,j,z));
                            visit[i][j][z]=true;
                            minute[i][j][z]=0;
                        }
                    }
                }
                br.readLine();
            }

            if(l==0 && r==0 && c==0){
                break;
            }
            else{
                System.out.println(escape(l, r, c));
            }
        }

    }


    
    static public String escape(int l,int r, int c){
        
        while(!queue.isEmpty()){
            Point point=queue.poll();
            int px=point.x;
            int py=point.y; 
            int pz=point.z; 

            for(int dir=0;dir<6;dir++){
                int nx=px+dx[dir];
                int ny=py+dy[dir];
                int nz=pz+dz[dir];

                if(nx<0 || ny<0 || nz<0 || nx>=r || ny>=c || nz>=l){
                    continue;
                }
                if(map[nz][nx][ny]=='E'){
                    return "Escaped in "+(minute[pz][px][py]+1)+" minute(s).";
                }
                if(map[nz][nx][ny]=='.' && !visit[nz][nx][ny]){
                    queue.add(new Point(nz,nx,ny));
                    visit[nz][nx][ny]=true;
                    minute[nz][nx][ny]=minute[pz][px][py]+1;
                }
            }
        }
        return "Trapped!";
    }
}
