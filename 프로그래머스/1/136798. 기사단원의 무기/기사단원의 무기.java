class Solution {
    public int solution(int number, int limit, int power) {

        int[] nums=new int[number];
        int sum=0;
        
        for(int i=1;i<=number;i++){
            nums[i-1]=getCount(i);
            if(nums[i-1]>limit){
                nums[i-1]=power;
            }
            sum+=nums[i-1];
        }
        return sum;
    }
    
    public int getCount(int num){
        
        int count=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                count++;
            }
        }
        
        return ++count;
    }
}