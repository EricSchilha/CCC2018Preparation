import java.util.Scanner;

public class J12017 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nX = sin.nextInt(), nY = sin.nextInt();
        if (nX > 0) {
            if (nY > 0)
                System.out.println('1');
            else
                System.out.println('4');
        } else {
            if (nY > 0)
                System.out.println('2');
            else
                System.out.println('3');
        }
    }
}