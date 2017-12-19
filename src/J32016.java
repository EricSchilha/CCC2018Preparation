
import java.util.Scanner;
public class J32016 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sWord = sin.next();
        boolean done = false;
        int nMPL = sWord.length();//max possible length
        int nMaxOffset = 0, nAns = 1;
        while(!done){
            nMaxOffset = sWord.length()-nMPL;
            for(int i = 0; i < nMaxOffset; i++){
                done = isPalindrome(sWord.substring(i, nMPL-nMaxOffset+i));
                if(done){
                    nAns = nMPL;
                    break;
                }
            }
            nMPL--;
        }
    }
    
    public static boolean isPalindrome(String sTest){
        return false;
    }
}
