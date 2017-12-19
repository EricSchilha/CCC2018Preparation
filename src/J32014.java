import java.util.Scanner;

public class J32014 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nRounds = sin.nextInt(), nA = 100, nB = 100, nRollA, nRollB;
        for (int i = 0; i < nRounds; i++) {
            nRollA = sin.nextInt();
            nRollB = sin.nextInt();
            if (nRollA > nRollB)
                nB -= nRollA;
            else if (nRollB > nRollA)
                nA -= nRollB;
        }
        System.out.println(nA);
        System.out.println(nB);
    }
}