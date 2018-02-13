
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.max;

public class S22016 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int question = sin.nextInt();
        int N = sin.nextInt();
        int nSum = 0;
        Integer dmoj[] = new Integer[N], peg[] = new Integer[N];
        for (int i = 0; i < N; i++)
            dmoj[i] = sin.nextInt();
        for (int i = 0; i < N; i++)
            peg[i] = sin.nextInt();
        Collections.sort(Arrays.asList(dmoj));
        Collections.sort(Arrays.asList(peg));
        if(question == 2){
            Collections.reverse(Arrays.asList(dmoj));
        }
        for(int i = 0; i < N; i++){
            nSum+=max(dmoj[i], peg[i]);
        }
        System.out.println(nSum);
    }
}
