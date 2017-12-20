import java.util.Scanner;

public class J32015 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sWord = sin.next();
        StringBuilder sbWord = new StringBuilder(sWord);
        for (int i = 0; i < sbWord.length(); i++) {
            char c = sbWord.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sbWord.replace(i, i + 1, "" + c + vowel(c) + cons(c));
                i += 2;
            }
        }
        System.out.println(sbWord);
    }

    public static char vowel(char cL1) {
        char cL2 = cL1;
        while (true) {
            cL1--;
            cL2++;
            if (cL1 == 'a' || cL1 == 'e' || cL1 == 'i' || cL1 == 'o' || cL1 == 'u') {
                return cL1;
            } else if (cL2 == 'a' || cL2 == 'e' || cL2 == 'i' || cL2 == 'o' || cL2 == 'u') {
                return cL2;
            }
        }
    }

    public static char cons(char cL) {
        while (cL != 'z') {
            cL++;
            if (cL != 'a' && cL != 'e' && cL != 'i' && cL != 'o' && cL != 'u') {
                return cL;
            }
        }
        return cL;
    }
}