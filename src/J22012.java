import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J22012 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int arnReadings[] = new int[4];
        String sCurRead = "";
        for (int i = 0; i < 4; i++) {
            arnReadings[i] = sin.nextInt();
            if (i == 0) continue;
            if (arnReadings[i] > arnReadings[i - 1] && (sCurRead.equals("Fish Rising") || sCurRead.equals(""))) {
                sCurRead = "Fish Rising";
            } else if (arnReadings[i] < arnReadings[i - 1] && (sCurRead.equals("Fish Diving") || sCurRead.equals(""))) {
                sCurRead = "Fish Diving";
            } else if (arnReadings[i] == arnReadings[i - 1] && (sCurRead.equals("Fish At Constant Depth") || sCurRead.equals(""))) {
                sCurRead = "Fish At Constant Depth";
            } else {
                sCurRead = "No Fish";
                break;
            }
        }
        System.out.println(sCurRead);
    }
}