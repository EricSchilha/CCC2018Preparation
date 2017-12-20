
import java.util.ArrayList;
import java.util.Scanner;


public class J42015 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int M = sin.nextInt();
        char c;
        int n;
        boolean found = false;
        ArrayList<Friend> alFriends = new ArrayList<>();
        for(int i = 0; i < M; i++){
            c = sin.next().charAt(0);
            n = sin.nextInt();
            if(c=='R'){
                found = false;
                for(int j = 0; j < alFriends.size(); j++){
                    if(alFriends.get(j).nNum==n){
                        found = true;
                        alFriends.get(j).increasing = true;
                        break;
                    }
                }
                if(!found){
                    alFriends.add(new Friend(n));
                }
            } else if(c=='S'){
                for(int j = 0; j < alFriends.size(); j++){
                    if(alFriends.get(j).nNum == n){
                        alFriends.get(j).increasing = false;
                    }
                }
            }
            
        }
    }
    
    static class Friend{
        int nNum, nTime;
        boolean increasing = true;
        Friend(int nNum){
            this.nNum = nNum;
            nTime = 0;
        }
    }
}
