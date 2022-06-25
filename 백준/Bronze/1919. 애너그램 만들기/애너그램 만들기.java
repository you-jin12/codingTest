import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] word1=sc.next().toCharArray();
        char[] word2=sc.next().toCharArray();
        int sum=0;
        int[] alpha=new int[26];
        for(int i=0;i<word1.length;i++){
            alpha[word1[i]-97]++;
        }
        for(int i=0;i<word2.length;i++){
            alpha[word2[i]-97]--;
        }
        for(int i=0;i<26;i++){
            sum+=Math.abs(alpha[i]);
        }
        System.out.print(sum);
    }
}