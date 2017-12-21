import java.util.Scanner;

public class J42012 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int K = sin.nextInt();
        String sWord = sin.next();
        StringBuilder sbWord = new StringBuilder(sWord);
        for (int i = 0; i < sWord.length(); i++) {
            sbWord.replace(i, i + 1, "" + (char) (sbWord.charAt(i) - K - (3 * (i + 1))));
            if (sbWord.charAt(i) < 'A') {
                sbWord.replace(i, i + 1, "" + (char) (91 - ((65 - sbWord.charAt(i)) % 26)));
            }
        }
        System.out.println(sbWord);
    }
}