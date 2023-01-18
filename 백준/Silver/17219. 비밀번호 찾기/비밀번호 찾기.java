import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        HashMap<String,String> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }//사이트주소,비번
        
        for(int i=0;i<m;i++){
            String key=br.readLine();
            System.out.println(map.get(key));
        }
	}
}