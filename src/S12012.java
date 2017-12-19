import java.util.Scanner;

public class S12012 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int J = sin.nextInt();
        System.out.println((J - 1) * (J - 2) * (J - 3) / 6);
    }
}