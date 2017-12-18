import java.util.Arrays;
import java.util.Scanner;

public class S32015 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int numOfGates = sin.nextInt();
        int planes = sin.nextInt();
        int count = 0;
        int maxGate = numOfGates;
        int gates[] = new int[numOfGates + 1];
        Arrays.fill(gates, 0);
        for (int i = 0; i < planes; i++) {
            int plane = sin.nextInt(), planeCopy, count1 = count;
            if (plane > maxGate) plane = maxGate;
            planeCopy = plane;
            while (planeCopy > 0) {
                if (gates[planeCopy] == 0) {
                    gates[planeCopy]++;
                    count++;
                    planeCopy = 0;
                    if (plane == maxGate) maxGate--;
                } else {
                    gates[planeCopy]++;
                    planeCopy -= (gates[planeCopy] - 1);
                }
            }
            if (count == count1) break;
        }
        System.out.println(count);
    }
}