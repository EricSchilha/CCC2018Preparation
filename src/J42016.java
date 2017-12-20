import java.util.Scanner;

public class J42016 {
    static int nM, nH;

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sLine = sin.next();
        nH = Integer.parseInt("" + sLine.charAt(0) + sLine.charAt(1));
        nM = Integer.parseInt("" + sLine.charAt(3) + sLine.charAt(4));
        boolean addExtra = false;
        for (int i = 0; i < 120; i++) {
            addExtra = false;
            if (nH >= 7 && nH <= 9)
                addExtra = true;
            if (nH >= 15 && nH <= 18)
                addExtra = true;
            increment();
            if (addExtra) {
                increment();
            }
        }
        sLine = "";
        if (nH < 10)
            sLine += '0';
        sLine += nH;
        sLine += ':';
        if (nM < 10)
            sLine += '0';
        sLine += nM;
        System.out.println(sLine);
    }

    public static void increment() {
        nM++;
        if (nM == 60) {
            nM = 0;
            nH++;
            if (nH == 24) nH = 0;
        }
    }
}