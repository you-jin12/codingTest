import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        char c;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<test;i++){
            String str=br.readLine();
            int length=str.length();
            for(int j=0;j<length;j++){
                c=str.charAt(j);
                if(c=='('){
                    stack.push(c);
                }
                else{
                    if(stack.empty()){
                        stack.push(c);
                        break;
                    }
                    else
                        stack.pop();
                }
            }
            if(stack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            stack.clear();
         }
    }
}