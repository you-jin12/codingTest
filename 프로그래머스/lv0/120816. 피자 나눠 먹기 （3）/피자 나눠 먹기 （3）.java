class Solution {
    public int solution(int slice, int n) {
        
        int pizza=1;
        int s=slice;
        
        while(slice<n){
            pizza++;
            slice=slice+s;
        }
        return pizza;
    }
}