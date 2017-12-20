import java.util.Scanner;

public class J12015 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nMonth = sin.nextInt(), nDay = sin.nextInt();
        if (nMonth > 2) {
            System.out.println("After");
        } else if (nMonth < 2) {
            System.out.println("Before");
        } else {
            if (nDay > 18) {
                System.out.println("After");
            } else if (nDay < 18) {
                System.out.println("Before");
            } else {
                System.out.println("Special");
            }
        }
    }
}