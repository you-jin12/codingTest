class Solution {
    public int solution(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            if(div(i)%2==0){
                sum+=i;
            }
            else{
                sum-=i;
            }
        }
        return sum;
    }
    
    //약수 갯수 구하는 메서드
    public int div(int num){
        int count=1;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }
}