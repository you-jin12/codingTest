import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());

        while(test-->0){

            int n=Integer.parseInt(br.readLine());
            int[] D=new int[n+4];

            D[0]=0;
            D[1]=1;
            D[2]=2;
            D[3]=4;

            for(int i=4;i<=n;i++){
                D[i]=D[i-1]+D[i-2]+D[i-3];
            }

            System.out.println(D[n]);
        }

        
    }
}
