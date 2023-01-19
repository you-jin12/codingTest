class Solution {
    public String solution(String s) {
        
        
        int[] alpha=new int[26];
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i); //c-97
            alpha[c-97]++;
        }
        
        for(int i=0;i<26;i++){
            if(alpha[i]==1){
                char c=(char)(i+97);
                answer=answer+c;
            }
        }
        return answer;
    }
}