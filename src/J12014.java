import java.util.Scanner;

public class J12014 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nA1, nA2, nA3;
        String sTriangle;
        nA1 = sin.nextInt();
        nA2 = sin.nextInt();
        nA3 = sin.nextInt();
        if (nA1 + nA2 + nA3 != 180) {
            sTriangle = "Error";
        } else if (nA1 == nA2 && nA2 == nA3) {
            sTriangle = "Equilateral";
        } else if (nA1 != nA2 && nA2 != nA3 && nA1 != nA3) {
            sTriangle = "Scalene";
        } else {
            sTriangle = "Isosceles";
        }
        System.out.println(sTriangle);
    }
}