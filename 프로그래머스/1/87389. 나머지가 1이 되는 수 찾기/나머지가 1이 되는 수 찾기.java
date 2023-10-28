class Solution {
    public int solution(int n) {
        
        int answer=0;
        int result=0;
        do{
            answer++;
            result=n%answer;
        }while(result!=1);
            
        return answer;
    }
}