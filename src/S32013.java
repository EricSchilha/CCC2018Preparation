
import java.util.*;
import java.util.*;


public class S32013 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int T = sin.nextInt(), G = sin.nextInt();//T fave team, G games played
        int teams[] = new int[5];//ignoring 0
        int remainingGames[] = new int[5];
        Arrays.fill(remainingGames, 3);
        for(int i = 0; i < G; i++){
            int teamA = sin.nextInt(), teamB = sin.nextInt();
            int scoreA = sin.nextInt(), scoreB = sin.nextInt();
            remainingGames[teamA]--;
            remainingGames[teamB]--;
            if(scoreA>scoreB){
                teams[teamA]+=3;
            } else if(scoreB>scoreA){
                teams[teamB]+=3;
            } else {
                teams[teamA]++;
                teams[teamB]++;
            }
        }
        for(int i = G; i <=6; i++){
            
        }
        
    }
}
