import java.util.Arrays;
import java.util.Scanner;

public class S22017 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        double tideCount = (int) sin.nextDouble();
        int tides[] = new int[(int) tideCount], lowTides[] = new int[(int) Math.ceil(tideCount / 2)], highTides[] = new int[(int) Math.floor(tideCount / 2)];
        for (int i = 0; i < tideCount; i++) {
            tides[i] = sin.nextInt();
        }
        Arrays.sort(tides);
        for (int i = 0; i < lowTides.length; i++) {
            lowTides[i] = tides[i];
        }
        for (int i = 0; i < highTides.length; i++) {
            highTides[i] = tides[i + lowTides.length];
        }
        Arrays.sort(highTides);
        Arrays.sort(lowTides);
        for (int i = 0; i < lowTides.length; i++) {
            System.out.print(lowTides[lowTides.length - i - 1] + " ");
            if (i != highTides.length || lowTides.length == highTides.length) {
                System.out.print(highTides[i] + " ");
            }
        }
    }
}