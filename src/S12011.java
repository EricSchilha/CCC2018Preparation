import java.util.Scanner;

public class S12011 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int N = sin.nextInt(), nTCount = 0, nSCount = 0;
        String sText;
        for (int i = 0; i < N + 1; i++) {
            sText = sin.nextLine();
            for (int j = 0; j < sText.length(); j++) {
                char c = sText.charAt(j);
                if (c == 's' || c == 'S') {
                    nSCount++;
                } else if (c == 't' || c == 'T') {
                    nTCount++;
                }
            }
        }
        System.out.println(nTCount > nSCount ? "English" : "French");
    }
}