import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int pLength=p.length();
        int answer = 0;
        
        Long pValue=Long.parseLong(p);
        
       for(int i=0;i<=(t.length()-pLength);i++){
            Long value=Long.parseLong(t.substring(i,i+pLength));
            if(pValue>=value) answer++;
            
        }
        return answer;
    }
}