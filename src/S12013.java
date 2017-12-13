
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schie3227
 */
public class S12013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nYear = sin.nextInt()+1;
        while (!isDistinct(nYear)) {
            nYear++;
        }
        System.out.println(nYear);
    }

    public static boolean isDistinct(int nYear) {
        String sYear = "" + nYear;
        for(int i = 0; i < sYear.length()-1; i++){
            for(int j = i+1; j < sYear.length(); j++){
                if(sYear.charAt(i) == sYear.charAt(j))return false;
            }
        }
        return true;
    }
}
