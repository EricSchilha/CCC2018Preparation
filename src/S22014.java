
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schie3227
 */
public class S22014 {
    private static String[] arnStudents;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        boolean isGood = true;
        int nStudents = sin.nextInt();
        String arnStudents1[] = new String[nStudents];
        String arnStudents2[] = new String[nStudents];
        for(int i = 0; i < nStudents; i++){
            arnStudents1[i] = sin.next();
        }
        for(int i = 0; i < nStudents; i++){
            arnStudents2[i] = sin.next();
        }
        for(int i = 0; i < nStudents; i++){
            isGood = checkMatch(arnStudents1[i], arnStudents2[i], arnStudents1, arnStudents2);
            if(!isGood)break;
        }
        if(!isGood){
            System.out.println("bad");
        } else {
            System.out.println("good");
        }
    }
    
    public static boolean checkMatch(String sStu1, String sStu2, String[] arnStu1, String[] arnStu2){
        for(int i = 0; i < arnStu1.length; i++){
            if(arnStu1[i].equals(sStu1) && !arnStu2[i].equals(sStu2))return false;
            if(!arnStu1[i].equals(sStu1) && arnStu2[i].equals(sStu2))return false;
            if(arnStu1[i].equals(sStu2) && !arnStu2[i].equals(sStu1))return false;
            if(!arnStu1[i].equals(sStu2) && arnStu2[i].equals(sStu1))return false;
        }
        if(sStu1.equals(sStu2))return false;
        return true;
    }
}
