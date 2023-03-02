import java.util.*;
import java.io.*;

public class Main {
    public static Queue<Integer> queue=new LinkedList<>();
    public static int[] dist;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int floor=Integer.parseInt(st.nextToken()); //총 층수
        int start=Integer.parseInt(st.nextToken()); // 시작 층수
        int g=Integer.parseInt(st.nextToken());//도달 층수
        int u=Integer.parseInt(st.nextToken());// 위로 u층 이동
        int d=Integer.parseInt(st.nextToken());//아래로 d층 이동


        int result=bfs(floor,start,g,u,d);

        if(result==-1){
            System.out.println("use the stairs");
        }
        else{
            System.out.println(result-1);
        }
    }

    public static int bfs(int floor,int start, int g,int u,int d){

        dist=new int[floor];
        queue.add(start);
        dist[start-1]=1;

        while(!queue.isEmpty()){
            int pf=queue.poll(); //현재 층수

            if(pf==g){
                return dist[pf-1];
            }
            for(int i=0;i<2;i++){
                int nf;
                if(i==0){ //올라가기
                    nf=pf+u;
                }
                else{ //내려가기
                    nf=pf-d;
                }

                if(nf>floor || nf<=0){
                    continue;
                }
                if(dist[nf-1]==0){//방문 안했으면
                    queue.add(nf);
                    dist[nf-1]=dist[pf-1]+1;
                }
            }
        }
        return -1;
    }
}