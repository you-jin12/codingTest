import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] student=new int[7][2];
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sex;
        int year;
        int roomcnt=0;
        for(int i=0;i<n;i++){
            sex=sc.nextInt();
            year=sc.nextInt();
            if(sex==0){
                student[year][0]++;
            }
            else{
                student[year][1]++;
            }
        }
        int stu=0;
        for(int i=1;i<7;i++){
            for(int j=0;j<2;j++){
                stu=student[i][j];
                if(stu==0) continue;
                else if(stu>=k){
                    if(stu%k==0) student[i][j]/=k;
                    else student[i][j]=(stu/k)+1;
                }
                else student[i][j]=1;
                roomcnt+=student[i][j];
            }
        }
        System.out.print(roomcnt);
    }
}