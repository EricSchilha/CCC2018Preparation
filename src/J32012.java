import java.util.Scanner;

public class J32012 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int k = sin.nextInt();
        char cDef[][] = {{'*', 'x', '*'},
                {' ', 'x', 'x'},
                {'*', ' ', '*'}};
        for (int i = 0; i < k * 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int l = 0; l < k; l++) {
                    System.out.print(cDef[i / k][j]);
                }
            }
            if (i != k * 3 - 1) System.out.println();
        }
    }
}