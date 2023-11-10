import java.util.*;

class Solution {
    public long solution(int n) {
        
        String value="";
        
        while(n>=1){
            value=value+(n%3);
            n=n/3;
        }
        
        long num=Long.parseLong(value);
        long answer = 0;
        System.out.println(value.length());
        System.out.println(num);
        
        for(int i=0;i<value.length();i++){
            long index=num%10;
            answer+=(index*Math.pow(3,i));
            num=num/10;
        }
        
        return answer;
    }
}