import java.util.*;
import java.io.*;

public class Main{
     public static HashMap<String,String> map=new HashMap<>();
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
       // HashMap<String,String> map=new HashMap<>();
        
        while(n-->0){
            String group=br.readLine();
            int pnum=Integer.parseInt(br.readLine());
            for(int i=0;i<pnum;i++){
                map.put(br.readLine(),group);//jihyo,twice
            }
        }
        
        while(m-->0){
            String quest=br.readLine();
            int num=Integer.parseInt(br.readLine());
            if(num==1){ //멤버이름 -> 팀이름
                System.out.println(map.get(quest));
            }
            else{ //팀이름 -> 멤버이름
                List list=getMember(quest);
                Iterator iter=list.iterator();
                while(iter.hasNext()){
                    System.out.println(iter.next());
                }
            }
        }
    }
    
    public static List getMember(String quest){
        
        ArrayList<String> member=new ArrayList<>();
        for(String key:map.keySet()){
            String mem=map.get(key);
            if(mem.equals(quest)){
                member.add(key);
            }
        }
        Collections.sort(member);
        return member;
    }
}