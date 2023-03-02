class Solution {
    public int solution(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i*j==n){
                    if(i==j){
                        sum+=i;
                    }
                    else{
                        sum+=i+j;   
                    }
                    break;
                }
            }
        }
        return sum;
    }
}