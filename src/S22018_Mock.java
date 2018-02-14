
import java.io.*;
import java.util.*;

public class S22018_Mock {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int N = sin.nextInt();
        String sNums = "", sFound1, sFound2;
        boolean reduced = true;
        for (int i = 0; i < N; i++) {
            sNums += (i < 10) ? i : 'A' + i - 10;
        }
        char arc[][] = new char[N][N];
        for (int i = 0; i < N; i++) {
            String sLine = sin.next();
            for (int j = 0; j < N; j++) {
                arc[i][j] = sLine.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            sFound1 = sFound2 = "";
            for (int j = 0; j < N; j++) {
                if (!sFound1.contains(arc[i][j] + "")) {
                    sFound1 += arc[i][j];
                } else {
                    System.out.println("No");
                    return;
                }
                if (!sFound2.contains(arc[j][i] + "")) {
                    sFound2 += arc[j][i];
                } else {
                    System.out.println("No");
                    return;
                }
            }
            if (reduced) {
                if (!sFound1.equals(sNums) || !sFound2.equals(sNums)) reduced = false;
                sNums = sNums.substring(1, sNums.length()) + sNums.charAt(0);
            }
        }
        System.out.println(reduced ? "Reduced" : "Latin");
    }
}