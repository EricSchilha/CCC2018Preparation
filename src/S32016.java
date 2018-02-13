import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//INCOMPLETE
public class S32016 {
    static int nStart = -1;
    static boolean isPho[];
    static ArrayList<ArrayList<Integer>> alAdjac = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        FastScanner sin = new FastScanner(System.in);
        int N = sin.nextInt(), M = sin.nextInt();
        isPho = new boolean[N];

        for (int i = 0; i < N; i++) {//Map out all restaurants
            alAdjac.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            if (nStart == -1) {
                nStart = sin.nextInt();
                isPho[nStart] = true;
            } else {
                isPho[sin.nextInt()] = true;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            int nRest1 = sin.nextInt(), nRest2 = sin.nextInt();
            alAdjac.get(nRest1).add(nRest2);
            alAdjac.get(nRest2).add(nRest1);
        }
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
