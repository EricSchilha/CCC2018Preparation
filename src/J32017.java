import java.util.Scanner;

public class J32017 {
    static int nX1, nX2, nY1, nY2;
    //static boolean solved = false;

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        nX1 = sin.nextInt();
        nY1 = sin.nextInt();
        nX2 = sin.nextInt();
        nY2 = sin.nextInt();
        int nCharge = sin.nextInt();
        int nDistance = Math.abs(nX1 - nX2) + Math.abs(nY1 - nY2);
        System.out.println((nDistance <= nCharge && ((nCharge - nDistance) % 2 == 0)) ? 'Y' : 'N');
        /*dest(nX1, nY1, nCharge);
        if (!solved) System.out.println('N');*/
    }

    /*public static void dest(int nX, int nY, int nC) {
        if (nX == nX2 && nY == nY2 && nC == 0 && !solved) {
            System.out.println('Y');
            solved = true;
            return;
        }
        if (nC > 0) dest(nX - 1, nY, nC - 1);
        if (nC > 0) dest(nX, nY - 1, nC - 1);
        if (nC > 0) dest(nX + 1, nY, nC - 1);
        if (nC > 0) dest(nX, nY + 1, nC - 1);
    }*/
}