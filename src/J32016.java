
import java.util.Scanner;

public class J32016 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sWord = sin.next();
        boolean done = false;
        int nMPL = sWord.length();//max possible length
        int nMaxOffset = 0, nAns = 1;
        while (!done) {
            for (int i = 0; i <= nMaxOffset; i++) {
                done = isPalindrome(sWord.substring(i, sWord.length() - nMaxOffset + i));
                if (done) {
                    nAns = nMPL;
                    break;
                }
            }

            nMPL--;
            nMaxOffset = sWord.length() - nMPL;
        }
        System.out.println(nAns);
    }

    public static boolean isPalindrome(String sTest) {
        StringBuilder sbTest = new StringBuilder(sTest);
        sbTest = sbTest.reverse();
        if (sTest.equals(sbTest.toString())) return true;
        return false;
    }
}
