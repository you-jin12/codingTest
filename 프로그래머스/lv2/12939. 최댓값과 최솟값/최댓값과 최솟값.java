import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st=new StringTokenizer(s);
        
        int min,max;
        int num=Integer.parseInt(st.nextToken());
        min=num;
        max=num;
        while(st.hasMoreTokens()){
            num=Integer.parseInt(st.nextToken());
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        String answer =min+" "+max;
        return answer;
    }
}