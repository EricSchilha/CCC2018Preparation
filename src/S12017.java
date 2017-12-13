/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author schie3227
 */
public class S12017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int N = sin.nextInt();
        int swiftRuns[] = new int[N];
        int semaRuns[] = new int [N];
        int swiftTotal = 0, semaTotal = 0, day = 0;
        for(int i = 0; i < N; i++){
            swiftRuns[i] = sin.nextInt();
        }
        for(int i = 0; i < N; i++){
            semaRuns[i] = sin.nextInt();
        }
        for(int i = 0; i < N; i++){
            swiftTotal += swiftRuns[i];
            semaTotal += semaRuns[i];
            if(swiftTotal == semaTotal)day = i+1;
        }
        System.out.println(day);
    }
}
