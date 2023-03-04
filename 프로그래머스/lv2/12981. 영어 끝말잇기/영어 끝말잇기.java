import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer=new int[2]; // 답 return
        int[] people=new int[n]; //사람 저장
        int windex=0;

        HashMap<String,Integer>map=new HashMap<>();
        
        char c2=words[0].charAt(0);
        while(windex<words.length){
            for(int i=0;i<n;i++){
                String str=words[windex];
                int slen=str.length();
                char c=str.charAt(0);
                if(c2!=c || map.containsKey(str)){
                    answer[0]=i+1;
                    answer[1]=people[i]+1;
                    return answer;
                }
                c2=str.charAt(slen-1);
                map.put(str,0);
                people[i]++;
                windex++;
            }
        }
        answer[0]=0;
        answer[1]=0;
        return answer;
    }
}