import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        List<Integer> ans=new ArrayList<>();
        int[] count=new int[3];
        
        int[] num1={1,2,3,4,5};
        int[] num2={2,1,2,3,2,4,2,5};
        int[] num3={3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0;i<answers.length;i++){
            
            if(answers[i]==num1[i%num1.length]){
                count[0]++;
            }
            if(answers[i]==num2[i%num2.length]){
                count[1]++;
            }
            if(answers[i]==num3[i%num3.length]){
                count[2]++;
            }
        }
        
        int max=Math.max(count[0],Math.max(count[1],count[2]));
        
        for(int i=0;i<count.length;i++){
            if(max==count[i]){
                ans.add(i+1);
            }
        }
        
        int[] answer=new int[ans.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=ans.get(i);
        }
        
        return answer; 
    }
}
