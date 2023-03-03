import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] b=new int[B.length];
        int index=0;
        
        for(int i=B.length-1;i>=0;i--){
            b[index]=B[i];
            index++;
        }
        int sum=0;
        
        for(int i=0;i<A.length;i++){
            sum=sum+(A[i]*b[i]);
        }
        
        return sum;
    }
}