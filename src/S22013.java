
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schie3227
 */
public class S22013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nMaxW = sin.nextInt(), nCrossedCars = 0, nTempW = 0;
        int arnCars[] = new int[sin.nextInt()];
        int arnCurCars[] = {0,0,0,0};
        for(int i = 0; i < arnCars.length; i++){
            arnCars[i] = sin.nextInt();
        }
        
        for(int i = 0; i < arnCars.length; i++){
            arnCurCars[3] = arnCurCars[2];
            arnCurCars[2] = arnCurCars[1];
            arnCurCars[1] = arnCurCars[0];
            arnCurCars[0] = arnCars[i];
            nTempW = 0;
            for(int j = 0; j < 4; j++){
                nTempW += arnCurCars[i];
            }
            if(nTempW > nMaxW){
                System.out.println(nCrossedCars);
                break;
            } else {
                nCrossedCars++;
            }
        }
    }
}
