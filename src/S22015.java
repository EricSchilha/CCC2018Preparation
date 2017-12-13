
import java.util.Scanner;


public class S22015 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nJerseys = sin.nextInt(), nAthletes = sin.nextInt(), nJNum, nSize, nSat = 0;
        char cSize;
        int arnSizes[] = new int[nJerseys];
        for(int i = 0; i < nJerseys; i++){
            cSize = sin.next().charAt(0);
            if(cSize == 'S'){
                arnSizes[i] = 1;
            } else if(cSize == 'M'){
                arnSizes[i] = 2;
            } else {
                arnSizes[i] = 3;
            }
        }
        for(int i = 0; i < nAthletes; i++){
            cSize = sin.next().charAt(0);
            nJNum = sin.nextInt();
            if(cSize == 'S'){
                nSize = 1;
            } else if(cSize == 'M'){
                nSize = 2;
            } else {
                nSize = 3;
            }
            if(nJNum-1 < arnSizes.length){
                if(arnSizes[nJNum-1] >= nSize){
                    nSat++;
                    arnSizes[nJNum-1] = 0;
                }
            }
        }
        System.out.println(nSat);
    }
}
