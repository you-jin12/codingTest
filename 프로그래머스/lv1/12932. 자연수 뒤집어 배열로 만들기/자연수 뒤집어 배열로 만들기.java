class Solution {
    public int[] solution(long n) {
        
        String str=""+n;
        int[] answer =new int[str.length()];
        int count=0;
        
        while(n>0){
            int num=(int)(n%10);
            n=n/10;
            answer[count]=num;
            count++;
        }
        return answer;
    }
}