import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        int i=sc.nextInt();
       
       System.out.print(text.charAt(i-1)); 
    }
}