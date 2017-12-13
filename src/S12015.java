
import java.util.ArrayList;
import java.util.Scanner;

public class S12015 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nK = sin.nextInt(), nTempNum, nSum = 0;
        ArrayList<Integer> alNums = new ArrayList<>();
        for(int i = 0; i < nK; i++){
            nTempNum = sin.nextInt();
            if(nTempNum != 0){
                alNums.add(nTempNum);
            } else {
                if(!alNums.isEmpty())alNums.remove(alNums.size() - 1);
            }
        }
        for(int i = 0; i < alNums.size(); i++){
            nSum+=alNums.get(i);
        }
        System.out.println(nSum);
    }
}
