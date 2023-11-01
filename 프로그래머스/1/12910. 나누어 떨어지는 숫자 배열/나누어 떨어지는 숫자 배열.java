import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> divList=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                divList.add(arr[i]);
            }
        }
        
        if(divList.isEmpty()){
            divList.add(-1);
        }
        
        Collections.sort(divList);
        int[] divArr=new int[divList.size()];
        
        for(int i=0;i<divArr.length;i++){
            divArr[i]=divList.get(i);
        }
        return divArr;
    }
}