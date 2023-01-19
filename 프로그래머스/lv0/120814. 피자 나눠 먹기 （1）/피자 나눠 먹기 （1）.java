class Solution {
    public int solution(int n) { //일곱조각
        
        if(n%7==0){
            return n/7;
        }
        else{
            return n/7+1;
        }
    }
}