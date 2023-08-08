import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] student=new boolean[30];
        int number;
        for(int i=0;i<28;i++){
            number=Integer.parseInt(br.readLine());
            student[number-1]=true;
        }
        
        for(int i=0;i<30;i++){
            if(!student[i]){
                System.out.println(i+1);
            }
        }
    }
}