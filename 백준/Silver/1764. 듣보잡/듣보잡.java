import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int hear=Integer.parseInt(st.nextToken());
        int see=Integer.parseInt(st.nextToken());
        List<String> list=new ArrayList<>();
        HashSet<String> hearList=new HashSet<>();

        for(int i=0;i<hear;i++){
            hearList.add(br.readLine());
        }

        for(int i=0;i<see;i++){
            String name=br.readLine();
            if(hearList.contains(name)){
                list.add(name);
            }
        }

        System.out.println(list.size());
        Collections.sort(list);

        for(String name:list){
            System.out.println(name);
        }
    }
}
