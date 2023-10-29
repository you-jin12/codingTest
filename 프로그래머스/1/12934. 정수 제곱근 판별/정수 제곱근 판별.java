class Solution {
    public long solution(long n) {
        long num=(long)Math.sqrt(n);
        long num2=(long)Math.pow(num,2);
        if(num2==n){
            return (long)Math.pow(num+1,2);
        }
        else{
            return -1;
        }
    }
}