import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int k=Integer.parseInt(st.nextToken());//수강가능인원
        int l=Integer.parseInt(st.nextToken()); //대기목록 길이
        
        LinkedHashSet<String> map=new LinkedHashSet<>();
        for(int i=0;i<l;i++){
            String student=br.readLine();
            if(map.contains(student)){
                map.remove(student);
            }
            map.add(student);
        }
        Iterator<String> iter=map.iterator();
        
        for(int i=0;i<k;i++){
            if(iter.hasNext()){
                System.out.println(iter.next());
            }
            else break;
        }
    }
}