import java.util.*;
import java.io.*;

public class Main{
    public static int[] stack;
    public static int cur=0;
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        stack=new int[n];
        
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            
            switch(str){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
            }
        }
    }
    public static void push(int data){
        stack[cur]=data;
        cur++;
    }
    public static void pop(){
        if(cur== 0){
            System.out.println(-1);
        }
        else{
            cur--;
            System.out.println(stack[cur]);
        }
    }
    public static void size(){
        System.out.println(cur);
    }
    public static void empty(){
        if(cur==0){
            System.out.println(1);
        }
        else System.out.println(0);
    }
    public static void top(){
        if(cur==0){
            System.out.println(-1);
        }
        else System.out.println(stack[cur-1]);
    }
}