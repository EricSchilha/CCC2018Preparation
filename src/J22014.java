import java.util.Scanner;

public class J22014 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int V = sin.nextInt(), nA = 0, nB = 0;
        String sVotes = sin.next();
        for (int i = 0; i < V; i++)
            if (sVotes.charAt(i) == 'A')
                nA++;
            else
                nB++;
        if (nA != nB)
            System.out.println(nA > nB ? 'A' : 'B');
        else
            System.out.println("Tie");
    }
}