
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schie3227
 */
public class S12013 {
    static class FastScanner {//Make static instead of public
        private BufferedReader br;
        private StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
            st = new StringTokenizer("");
        }

        private String next() throws IOException {
            if (st.hasMoreTokens()) return st.nextToken();
            else st = new StringTokenizer(br.readLine());
            return next();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            if (!st.hasMoreTokens()) return br.readLine();
            String cont = st.nextToken();
            while (st.hasMoreTokens()) {
                cont += " " + st.nextToken();
            }
            return cont;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner sin = new FastScanner(System.in);
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
