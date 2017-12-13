
import java.util.Arrays;
import java.util.Scanner;

public class S32017 {

    static Scanner sin = new Scanner(System.in);
    static int nBoards = sin.nextInt();
    static int arnBoards[] = new int[nBoards];
    static int arnHeights[];
    public static void main(String[] args) {
        for (int i = 0; i < arnBoards.length; i++) {
            arnBoards[i] = sin.nextInt();
        }
        arnHeights = new int[arnBoards[arnBoards.length-1] + arnBoards[arnBoards.length-1] + 1];
        

    }

    public static void buildBoard(int nSum, int nCount, int nPos) {
        if (nCount == 3) {
            return;
        }
        nSum += arnBoards[nPos];
        
    }
}