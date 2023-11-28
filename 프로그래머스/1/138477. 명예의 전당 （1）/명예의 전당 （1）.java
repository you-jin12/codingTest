import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer =new int[score.length];
        int min=0;
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<k;i++){
            if(i>=score.length) break;
            list.add(score[i]);
            answer[i]=Collections.min(list);
        }
        
        for(int i=k;i<score.length;i++){
            min=Collections.min(list);
            int index=list.indexOf(min);
            
            if(score[i]>min){
                list.remove(index);
                list.add(score[i]);
            }
            
            answer[i]=Collections.min(list);
        }
        return answer;
    }
}