class Solution {
    public int[] solution(int[] arr) {
        
        int min=arr[0];
        int index=0;
        
        if(arr.length == 1){
            return new int[] {-1};
        }
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        
        int[] answer = new int[arr.length-1];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min){
                answer[index]=arr[i];
                index++;
            }
        }
        return answer;
    }
}