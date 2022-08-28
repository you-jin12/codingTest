import java.util.*;
import java.io.*;

public class Main{
    static int[] stack=new int[10000];
    static int peak=0;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int number;
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String op=st.nextToken();
            
            switch(op){
                case "push":
                    number=Integer.parseInt(st.nextToken());
                    push(number); break;
                case "pop":
                    pop(); break;
                case "size":
                    size(); break;
                case "empty":
                    empty(); break;
                case "top":
                    top(); break;
            }
        }
    }
    public static void push(int num){
        stack[peak]=num; peak++;
    }
    
    public static void pop(){
        if(peak==0){
            System.out.println(-1);
        }
        else{
            peak=peak-1;
            System.out.println(stack[peak]);
        }
    }
    
    public static void size(){
        System.out.println(peak);
    }
    
    public static void empty(){
        if(peak==0){
            System.out.println(1);
        }
        else
            System.out.println(0);
    }
    
    public static void top(){
        if(peak==0){
            System.out.println(-1);
        }
        else 
            System.out.println(stack[peak-1]);
    }
}