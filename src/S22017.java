
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S22017 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int tideCount = sin.nextInt();
        int tides[] = new int[tideCount], lowTides[] = new int[(int) Math.ceil(tideCount / 2)], highTides[] = new int[(int) Math.floor(tideCount / 2)];
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
        for (int i = 0; i < lowTides.length/2; i++) {
            int temp = lowTides[i];
            lowTides[i] = lowTides[lowTides.length - 1 - i];
            lowTides[lowTides.length - 1 - i] = temp;
        }
        for (int i = 0; i < lowTides.length; i++) {
            System.out.print(lowTides[i] + " ");
            /*if(!(i==highTides.length-1 && lowTides.length>highTides.length))
             System.out.print(highTides[i] + " ");*/
        }
        System.out.println("");
        for (int i = 0; i < highTides.length; i++) {
            System.out.print(highTides[i] + " ");
            /*if(!(i==highTides.length-1 && lowTides.length>highTides.length))
             System.out.print(highTides[i] + " ");*/
        }
    }
}
