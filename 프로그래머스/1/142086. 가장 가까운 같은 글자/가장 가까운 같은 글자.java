import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer =new int[s.length()];
        String[] sArr=s.split("");
        
        for(int i=0;i<sArr.length;i++){
            String word=sArr[i];
            int index=Arrays.asList(sArr).indexOf(word);
            
            if(index<i){
                answer[i]=i-index;
                sArr[index]=" ";
            }
            else{
                answer[i]=-1;
            }
        }
        return answer;
    }
}