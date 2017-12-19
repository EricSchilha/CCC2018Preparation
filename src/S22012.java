import java.util.Scanner;

public class S22012 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sLine = sin.next();
        int nTotal = 0;
        int j = 0;
        for (int i = 0; i < sLine.length() - 2; i += 2) {
            j = i;
            if (valueOf(sLine.charAt(i + 1)) >= valueOf(sLine.charAt(i + 3)))
                nTotal += Integer.parseInt("" + sLine.charAt(i)) * valueOf(sLine.charAt(i + 1));
            else
                nTotal -= Integer.parseInt("" + sLine.charAt(i)) * valueOf(sLine.charAt(i + 1));
        }
        nTotal += Integer.parseInt("" + sLine.charAt(j + 2)) * valueOf(sLine.charAt(j + 3));
        System.out.println(nTotal);
    }

    public static int valueOf(char cRN) {
        switch (cRN) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 1;
    }
}