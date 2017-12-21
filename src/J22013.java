import java.util.Scanner;

public class J22013 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sWord = sin.next();
        boolean yes = true;
        for (int i = 0; i < sWord.length(); i++) {
            char c = sWord.charAt(i);
            if (c != 'I' && c != 'O' && c != 'S' && c != 'H' && c != 'Z' && c != 'X' && c != 'N') {
                yes = false;
                break;
            }
        }
        System.out.println((yes) ? "YES" : "NO");
    }

    /*BETTER SOLUTION
        public static void main(String[] args) {
            Scanner sin = new Scanner(System.in);
            String sWord = sin.next();
            String sLetters = "IOSHZXN";
            for(int i = 0; i < sWord.length(); i++){
                char c = sWord.charAt(i);
                if(sWord.indexOf(sWord.charAt(i)==-1){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
     */
}