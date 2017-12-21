import java.util.Arrays;
import java.util.Scanner;

public class J42013 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int T = sin.nextInt();
        int C = sin.nextInt();
        int nCompleted = 0, nTime = 0;
        int arnChores[] = new int[C];
        for (int i = 0; i < C; i++) {
            arnChores[i] = sin.nextInt();
        }
        Arrays.sort(arnChores);
        while (nTime <= T) {//Was fine for solution but if they can complete all the chores this breaks
            nTime += arnChores[nCompleted];
            nCompleted++;
        }
        System.out.println(nCompleted - 1);
    }
}