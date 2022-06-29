import java.util.*;
import java.io.*;

public class Main{
    public static int[] queue;
    public static int head=0,tail=0;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        queue=new int[n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            switch(str){
                case "push" :
                    push(Integer.parseInt(st.nextToken())); break;
                case "pop":
                    pop() ; break;
                case "size" :
                    size(); break;
                case "empty" :
                    empty(); break;
                case "front" : 
                    front(); break;
                case "back" :
                    back(); break;
            }
        }
    }
    public static void push(int data){
        queue[tail++]=data;
    }
    public static void pop(){
        if(head==tail){
            System.out.println(-1);
        }
        else{
            System.out.println(queue[head]);
            head++;
        }
    }
    public static void size(){
        System.out.println(tail-head);
    }
    public static void empty(){
        if(head==tail){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    public static void front(){
        if(head==tail){
            System.out.println(-1);
        }
        else{
            System.out.println(queue[head]);
        }
    }
    public static void back(){
        if(head==tail){
            System.out.println(-1);
        }
        else{
            System.out.println(queue[tail-1]);
        }
    }
}