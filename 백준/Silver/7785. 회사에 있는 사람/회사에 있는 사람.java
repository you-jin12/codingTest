import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        HashMap<String,String> map=new HashMap<>();
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            String log=st.nextToken();
            if(map.containsKey(name)){
                map.remove(name);
            }
            else 
                map.put(name,log);
        }
        List<String> list=new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());
        for(String key : list){
            System.out.println(key);
        }
    }
}