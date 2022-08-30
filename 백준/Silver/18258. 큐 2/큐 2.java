import java.util.*;
import java.io.*;

public class Main{
    static int[] queue=new int[2000000];
    static int front=0;
    static int back=0;
    
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String op;
        int n=Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            op=st.nextToken();
            switch(op){
                case "push":
                    int num=Integer.parseInt(st.nextToken());
                    push(num); break;
                case "pop":
                    pop(); break;
                case "size":
                    size(); break;
                case "empty":
                    empty(); break;
                case "front":
                    front(); break;
                case "back":
                    back(); break;
                    
            }
        }
        System.out.println(sb);
     }
     public static void push(int num){
         queue[back]=num;
         back=back+1;
     }
    public static void pop(){
        if(back==front){
            sb.append(-1).append('\n');
        }
        else{
            sb.append(queue[front]).append('\n');
            front++;
        }
    }
    public static void size(){
        sb.append(back-front).append('\n');
    }
    public static void empty(){
        if(back==front){
            sb.append(1).append('\n');
        }
        else sb.append(0).append('\n');
    }
    public static void front(){
        if(back==front){
            sb.append(-1).append('\n');
        }
        else{
            sb.append(queue[front]).append('\n');
        }
    }
    public static void back(){
        if(back==front){
            sb.append(-1).append('\n');
        }
        else{
            sb.append(queue[back-1]).append('\n');
        }
    }
}