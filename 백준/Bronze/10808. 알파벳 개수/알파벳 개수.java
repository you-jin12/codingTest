import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int[] alpha=new int[26];
        
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i);
            alpha[c-97]++;
        }
        for(int i: alpha){
            System.out.print(i+" ");
        }
    }
}