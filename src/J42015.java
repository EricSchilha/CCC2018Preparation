
import java.util.*;

//INCOMPLETE
public class J42015 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int M = sin.nextInt(), n, nWait;
        char c;
        boolean found;
        ArrayList<Friend> alFriends = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            nWait = 1;
            c = sin.next().charAt(0);
            n = sin.nextInt();
            if (c == 'R') {
                found = false;
                for (int j = 0; j < alFriends.size(); j++) {
                    if (alFriends.get(j).nNum == n) {
                        found = true;
                        alFriends.get(j).increasing = true;
                        break;
                    }
                }
                if (!found) {
                    alFriends.add(new Friend(n));
                }
            } else if (c == 'S') {
                for (int j = 0; j < alFriends.size(); j++) {
                    if (alFriends.get(j).nNum == n) {
                        alFriends.get(j).increasing = false;
                    }
                }
            } else {
                nWait += n - 1;
            }
            for (int j = 0; j < alFriends.size(); j++) {
                alFriends.get(j).nTime += (alFriends.get(j).increasing) ? nWait : 0;
            }

        }
        for (int i = 0; i < alFriends.size(); i++) {
            if (alFriends.get(i).increasing) {
                System.out.println(alFriends.get(i).nNum + " -1");
            } else {
                System.out.println(alFriends.get(i).nNum + " " + alFriends.get(i).nTime);
            }
        }
    }

    static class Friend {
        int nNum, nTime;
        boolean increasing = true;

        Friend(int nNum) {
            this.nNum = nNum;
            nTime = -1;
        }
    }
}
