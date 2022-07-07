import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str;
        int count=0;
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<n;i++){
            str=sc.next();
            for(int j=0;j<str.length();j++){
                if(!stack.isEmpty() && str.charAt(j)==stack.peek()){
                    stack.pop();
                }
                else stack.push(str.charAt(j));
            }
            if(stack.isEmpty()) count++;
            stack.clear();
        }
        System.out.println(count);
    }
}