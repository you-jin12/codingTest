import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        int sum=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<k;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        while(stack.empty()==false){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}