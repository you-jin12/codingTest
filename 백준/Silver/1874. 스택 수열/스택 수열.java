import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Stack<Integer>stack=new Stack<>();
        
        int start=0;
        int num;
        int n=Integer.parseInt(br.readLine());
        
        while(n-->0){
            num=Integer.parseInt(br.readLine());
            
            if(start<num){
                for(int i=start+1;i<=num;i++){
                    stack.push(new Integer(i));
                    sb.append('+').append('\n');
                }
                start=num;
            }
            if(stack.peek()!=num){
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}