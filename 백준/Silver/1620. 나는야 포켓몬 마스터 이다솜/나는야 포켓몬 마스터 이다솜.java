import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] arg)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        HashMap<String,Integer>map=new HashMap<>();
        String[] map2=new String[n+1];
        
        for(int i=1;i<=n;i++){
            String key=br.readLine();
            map.put(key,i);
            map2[i]=key;
        }
        
        for(int i=0;i<m;i++){
            String key=br.readLine();
            boolean state=keyCheck(key);
            if(state){ //map
                System.out.println(map.get(key));
            }
            else{
                int numKey=Integer.parseInt(key);
                System.out.println(map2[numKey]);
            }
        }
    }
    
    public static boolean keyCheck(String key){
        int c=key.charAt(0);
        
        if(c>=65 && c<=91){ //대문자면
            return true;
        }
        else return false;
    }
}