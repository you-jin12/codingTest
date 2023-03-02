import java.util.*;

class Solution {
    boolean solution(String s) {
        s=s.toLowerCase();
        int pcount=0;
        int ycount=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='y'){
                ycount++;
            }
            else if(c=='p'){
                pcount++;
            }
        }
        
        if(pcount==ycount){
            return true;
        }
        else if(pcount==0 && ycount==0){
            return true;
        }
        else{
            return false;
        }
    }
}