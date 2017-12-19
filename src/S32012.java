import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.util.Collections.*;

public class S32012 {
    public static void main(String[] args) throws IOException {
        FastScanner sin = new FastScanner(System.in);
        int N = sin.nextInt();
        int arnFreq[] = new int[1001];
        int nMax1 = 0, nMax2 = 0;
        ArrayList<Integer> alMax1 = new ArrayList<>();
        ArrayList<Integer> alMax2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arnFreq[sin.nextInt()]++;
        }
        for (int i = 0; i < arnFreq.length; i++) {
            if (arnFreq[i] > nMax1) {
                nMax2 = nMax1;
                nMax1 = arnFreq[i];
            } else if (arnFreq[i] <= nMax1 && arnFreq[i] > nMax2) {
                nMax2 = arnFreq[i];
            }
        }
        for (int i = 0; i < arnFreq.length; i++) {
            if (arnFreq[i] == nMax1) alMax1.add(i);
            if (arnFreq[i] == nMax2) alMax2.add(i);
        }
        Collections.sort(alMax1);
        Collections.sort(alMax2);
        System.out.println(Math.max(Math.abs(max(alMax1) - min(alMax2)), Math.abs(max(alMax2) - min(alMax1))));
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