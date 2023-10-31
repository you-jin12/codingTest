class Solution {
    public long solution(int a, int b) {
        
        long sum=0;
        
        if(a==b){
            return a;
        }
        else if(a>b){
            for(int i=a;i>=b;i--){
                sum=sum+i;
            }
        }
        else{
            for(int i=a;i<=b;i++){
                sum=sum+i;
            }
        }
        
        return sum;
    }
}