class Solution {
    public String solution(String phone_number) {
        
        int length=phone_number.length();
        int star=length-4;
        String answer = "";
        
        for(int i=0;i<star;i++){
            answer+="*";
        }
        
        for(int i=star;i<length;i++){
            char c=phone_number.charAt(i);
            answer+=c;
        }
        return answer;
    }
}