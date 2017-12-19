
import java.util.Scanner;


public class J12016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nWins = 0;
        for(int i = 0; i < 6; i++)
            if(sin.next().charAt(0)=='W')nWins++;
        if(nWins>4)
            System.out.println("1");
        else if(nWins>2)
            System.out.println("2");
        else if(nWins>0)
            System.out.println("3");
        else
            System.out.println("-1");
    }
}
