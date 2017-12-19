import java.util.Scanner;

public class J22017 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int N = sin.nextInt();
        int k = sin.nextInt();
        int nSum = 0;
        for (int i = 0; i <= k; i++)
            nSum += N * Math.pow(10, i);

        System.out.println(nSum);
    }
}