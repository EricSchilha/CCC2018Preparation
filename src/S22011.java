import java.util.Scanner;

public class S22011 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int C = sin.nextInt();
        int nCorrect = 0;
        char[] arcCorrect = new char[C];
        for (int i = 0; i < C; i++) {
            arcCorrect[i] = sin.next().charAt(0);
        }
        for (int i = 0; i < C; i++) {
            if (sin.next().charAt(0) == arcCorrect[i]) nCorrect++;
        }
        System.out.println(nCorrect);
    }
}