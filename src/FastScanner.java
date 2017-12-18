import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Something I found that can be used to increase the speed of the scanner
//by using a BufferedReader instead while allowing the ease of use of the
//original Scanner class

public class FastScanner {//Make static instead of public
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