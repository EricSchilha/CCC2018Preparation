import java.util.Scanner;

public class J22015 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nHappy = 0, nSad = 0;
        String sLine = sin.nextLine();
        for (int i = 0; i < sLine.length() - 2; i++) {
            if (sLine.charAt(i) == ':' && sLine.charAt(i + 1) == '-') {
                if (sLine.charAt(i + 2) == ')') nHappy++;
                if (sLine.charAt(i + 2) == '(') nSad++;
            }
        }
        if (nHappy > 0 || nSad > 0) {
            if (nHappy > nSad) {
                System.out.println("happy");
            } else if (nSad > nHappy) {
                System.out.println("sad");
            } else {
                System.out.println("unsure");
            }
        } else {
            System.out.println("none");
        }
    }
}