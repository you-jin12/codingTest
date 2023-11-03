class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean check=false;
        
        for(int i=0;i<=9;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==i){ //존재하는 숫자면
                    check=true;
                    break;
                }
            }
            if(!check){
                answer+=i;
            }
            else{
                check=false;
            }
        }
        return answer;
    }
}