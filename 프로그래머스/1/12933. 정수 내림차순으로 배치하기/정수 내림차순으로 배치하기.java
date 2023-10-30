import java.util.*;

class Solution {
    public long solution(long n) {
        
        List<Long> numList=new ArrayList<>();
        
        while(n>0){
            long num=n%10;
            n=n/10;
            numList.add(num);
        }
        
        Collections.sort(numList,Collections.reverseOrder());
        
        String strNum="";
        
        for(long i:numList){
            strNum=strNum+i;
        }
        
        return Long.valueOf(strNum);
    }
}