import java.util.*;
import java.io.*;

class Point2{

    int x,y,size;
    public Point2(int x,int y,int size){
        this.x=x;
        this.y=y;
        this.size=size;
    } 
}
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int m=Integer.parseInt(st.nextToken());//m행
        int n=Integer.parseInt(st.nextToken());//n열
        int k=Integer.parseInt(st.nextToken());
        int count=0;

        int[][] map=new int[m][n];
        Queue<Point2> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        boolean[][] visit=new boolean[m][n];
        int[] dx={0,0,1,-1};
        int[] dy={-1,1,0,0};
        
        for(int i=0;i<k;i++){
            st=new StringTokenizer(br.readLine());
            int ly=Integer.parseInt(st.nextToken());//왼쪽 y
            int lx=Integer.parseInt(st.nextToken());//왼쪽 x
            int ry=Integer.parseInt(st.nextToken());//오른쪽 y
            int rx=Integer.parseInt(st.nextToken());//오른쪽 x
            
            for(int x=lx;x<rx;x++){//2~4  1~5  0~2
                for(int y=ly;y<ry;y++){
                    visit[m-x-1][y]=true;
                }
            }
        }

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(!visit[i][j] && map[i][j]==0){
                    int size=0;
                    queue.add(new Point2(i,j,1));
                    map[i][j]=1;
                    visit[i][j]=true;
                    count++;
                    size++;

                    while(!queue.isEmpty()){
                        Point2 point=queue.poll();
                        int px=point.x;
                        int py=point.y;

                        for(int dir=0;dir<4;dir++){
                            int nx=px+dx[dir];
                            int ny=py+dy[dir];

                            if(nx<0 || ny<0 || nx>=m || ny>=n){
                                continue;
                            }
                            if(map[nx][ny]==0 && !visit[nx][ny]){
                                queue.add(new Point2(nx,ny,point.size++));
                                map[nx][ny]=point.size++;
                                visit[nx][ny]=true;
                                size++;
                            }
                        }
                    }
                    list.add(size);
                }
            }
        }

        Collections.sort(list);

        System.out.println(count);
        for(int s:list){
            System.out.print(s+" ");
        }
    }
}