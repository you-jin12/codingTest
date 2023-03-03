class Solution {
    public int solution(int n) {
        
        int count=binary(n);
        int count2=0;
        
        while(count2!=count){
            count2=binary(++n);
        }
        return n;
    }
    
    public int binary(int n){
        int count=0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}