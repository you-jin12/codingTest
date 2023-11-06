import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        
        int max=0;
        int min=0;
        int num=n>m ? m : n;
        
        for(int i=1;i<=num;i++){
            if(n%i==0 && m%i==0){
                max=Math.max(max,i);
            }
        }

        for(int i=num;i>=1;i--){
            if(n%i==0 && m%i==0){
                min=i*(n/i)*(m/i);
                break;
            }
        }
        
        int[] answer={max,min};
        return answer;
    }
}