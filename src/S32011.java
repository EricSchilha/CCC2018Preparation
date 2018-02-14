import java.io.*;
import java.util.*;

public class S32011 {
    public static void main(String[] args) throws IOException {
        FastScanner sin = new FastScanner(System.in);
        int T = sin.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(isCellEmpty(sin.nextInt(), sin.nextInt(), sin.nextInt()) ? "empty" : "crystal");
        }
    }

    public static boolean isCellEmpty(int m, int x, int y) {
        if (m == 0) return true;
        int x2 = (int) Math.floor(x / Math.pow(5, m - 1));
        int y2 = (int) Math.floor(y / Math.pow(5, m - 1));
        if ((y2 == 0 && x2 > 0 && x2 < 4) || (y2 == 1 && x2 == 2)) {
            return false;
        } else if ((y2 == 1 && (x2 == 1 || x2 == 3)) || (y2 == 2 && x2 == 2)) {
            return isCellEmpty(m - 1, (int) Math.floor(x % Math.pow(5, m - 1)), (int) Math.floor(y % Math.pow(5, m - 1)));
        }
        return true;
    }

    static class FastScanner {
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
}