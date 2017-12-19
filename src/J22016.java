
import java.util.ArrayList;
import java.util.Scanner;

public class J22016 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int arnSquare[][] = new int[4][4];
        int nRowSum = 0;
        ArrayList<Integer> alSums = new ArrayList<>();
        boolean isMagic = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arnSquare[j][i] = sin.nextInt();
                nRowSum += arnSquare[j][i];
            }
            alSums.add(nRowSum);
            nRowSum = 0;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nRowSum += arnSquare[i][j];
            }
            alSums.add(nRowSum);
            nRowSum = 0;
        }
        for (int i = 0; i < alSums.size(); i++) {
            if (alSums.get(i) != alSums.get(0)) {
                isMagic = false;
                break;
            }
        }
        System.out.println(isMagic ? "magic" : "not magic");
    }
}
