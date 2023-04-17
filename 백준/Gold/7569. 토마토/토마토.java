import java.util.*;
import java.io.*;

class Tomato{
    int x,y,z;
    
    public Tomato(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int m=Integer.parseInt(st.nextToken()); //가로칸 수(열)
        int n=Integer.parseInt(st.nextToken()); //세로칸 수(행)
        int h=Integer.parseInt(st.nextToken()); // 높이

        Queue<Tomato> queue=new LinkedList<>();
        int[][][] tomato=new int[n][m][h]; //행열높이

        int[] dx={0,0,1,-1,0,0};
        int[] dy={0,0,0,0,1,-1};
        int[] dz={1,-1,0,0,0,0};

        //0->안익토 1->익토 -1 ->노토
        for(int i=0;i<h;i++){
            for(int j=0;j<n;j++){
                st=new StringTokenizer(br.readLine()); 
                for(int z=0;z<m;z++){
                    tomato[j][z][i]=Integer.parseInt(st.nextToken()); //행열높이
                    if(tomato[j][z][i]==1){
                        queue.add(new Tomato(j, z, i));
                    }
                }
            }
        }

        while(!queue.isEmpty()){
            Tomato to=queue.poll();
            int px=to.x;//행
            int py=to.y;//열
            int pz=to.z;//높이

            for(int i=0;i<6;i++){
                int nx=px-dx[i];
                int ny=py-dy[i];
                int nz=pz-dz[i];
                if(nx<0 || ny<0 || nz<0 || nx>=n || ny>=m || nz>=h){
                    continue;
                }
                if(tomato[nx][ny][nz]==0){
                    queue.add(new Tomato(nx,ny,nz));
                    tomato[nx][ny][nz]=tomato[px][py][pz]+1;
                }
            }
        }

        int day=-2;

        for(int i=0;i<h;i++){
            for(int j=0;j<n;j++){
                for(int z=0;z<m;z++){
                    if(tomato[j][z][i]==0){
                        System.out.println(-1);
                        return;
                    }
                    else{
                        day=Math.max(day,tomato[j][z][i]);
                    }
                }
            }
        }


        if(day==1){
            System.out.println(0);
        }
        else{
            System.out.println(day-1);
        }
    }
}