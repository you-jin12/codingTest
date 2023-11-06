class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice=0;
        long answer = -1;
        
        while(count>0){
            totalPrice+=(price*count--);
        }
        
        if(totalPrice<money) return 0;
        answer=totalPrice-money;
        return answer;
    }
}