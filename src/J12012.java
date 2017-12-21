import java.util.Scanner;

public class J12012 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nSL = sin.nextInt(), nSpeed = sin.nextInt(), nF;
        if (nSpeed > nSL) {
            int n = nSpeed - nSL;
            if (n <= 20) {
                nF = 100;
            } else if (n <= 30) {
                nF = 270;
            } else {
                nF = 500;
            }
            System.out.format("You are speeding and your fine is $%d.", nF);
        } else System.out.println("Congratulations, you are within the speed limit!");
    }
}