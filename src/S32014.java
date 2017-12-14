import java.util.ArrayList;
import java.util.Scanner;

public class S32014 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        ArrayList<Integer> alCars = new ArrayList<>();
        String sAnswer = "";
        int nCases = sin.nextInt();
        int nCarCount;
        for (int i = 0; i < nCases; i++) {
            nCarCount = sin.nextInt();
            alCars.add(0);
            for (int j = 0; j < nCarCount; j++) {
                alCars.add(sin.nextInt());
            }
            if (checkOrder(alCars)) {
                sAnswer += "Y";
            } else {
                sAnswer += "N";
            }
            alCars.clear();
        }
        for (int i = 0; i < sAnswer.length(); i++) {
            System.out.println(sAnswer.charAt(i));
        }
    }

    public static boolean checkOrder(ArrayList<Integer> alCars) {
        int nCAL = 0;//Cars At Lake
        int nStartCount = alCars.size();
        ArrayList<Integer> alBranchCars = new ArrayList<>();
        alBranchCars.add(0);
        while (alCars.size() > 1 || alBranchCars.size() > 1) {
            if (alCars.get(alCars.size() - 1) == nCAL + 1) {
                nCAL++;
                alCars.remove(alCars.size() - 1);
            } else if (alBranchCars.get(alBranchCars.size() - 1) == nCAL + 1) {
                nCAL++;
                alBranchCars.remove(alBranchCars.size() - 1);
            } else {
                if (alCars.size() > 1) {
                    alBranchCars.add(alCars.get(alCars.size() - 1));
                    alCars.remove(alCars.size() - 1);
                } else {
                    if (alBranchCars.get(alBranchCars.size() - 1) != nCAL + 1) {
                        return false;
                    }
                }
            }
            if (nCAL == nStartCount) {
                return true;
            }
        }
        return true;
    }
}