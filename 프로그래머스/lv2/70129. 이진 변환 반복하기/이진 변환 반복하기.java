class Solution {
    public int[] solution(String s) {
        int zero=0; //없앤 0 개수
        int change=0; // 이진 변환 횟수
        int len=0;
        int[] answer=new int[2];
        
        while(!s.equals("1")){
            int slen=s.length();
            s=s.replace("0","");
            len=s.length();
            zero=slen-len+zero;
            s="";
            while(len>0){
                s=s+(len%2);
                len/=2;
            }
            change++;
        }
        answer[0]=change;
        answer[1]=zero;
        
        return answer;
    }
}