class Solution {
    public int solution(int num) {
        
        long n=num;
        int count=0;
        
        while(n!=1){
            if(count>=500){
                return -1;
            }
            count++;
            if(n%2==0){
                n=n/2;
            }
            else{
                n=(n*3)+1;
            }
        }
        
        if(count==0) return 0;
        else return count;
    }
}