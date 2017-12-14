
import java.util.Scanner;

public class S12016 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        StringBuilder anagram1 = new StringBuilder(sin.nextLine()), anagram2 = new StringBuilder(sin.nextLine());
        char ans = 'A';
        for (int i = 0; i < anagram1.length(); i++) {
            for (int j = 0; j < anagram2.length(); j++) {
                if (anagram1.charAt(i) == anagram2.charAt(j)) {
                    anagram2.deleteCharAt(j);
                    j = anagram2.length();
                }
            }
        }
        for (int i = 0; i < anagram2.length(); i++) {
            if (anagram2.charAt(i) != '*') {
                ans = 'N';
                break;
            }
        }
        System.out.println(ans);
    }
}
