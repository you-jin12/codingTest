import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());//수의 갯수
        int m=Integer.parseInt(st.nextToken());//테케 갯수

        int[] score=new int[n+1];
        int[] D=new int[n+1];

        st=new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++){
            D[i]=D[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int test=0;test<m;test++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            System.out.println(D[j]-D[i-1]);
        }
    }
}