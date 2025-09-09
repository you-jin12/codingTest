import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r, c;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        recursion((int) Math.pow(2.0, n), 0, 0);
        System.out.println(result);

    }

    public static void recursion(int n, int x, int y) {

        if (n == 1) {
            return;
        }

        int ns = n / 2;

        if (r < (x + ns) && c < (y + ns)) { // 0사분면
            recursion(ns, x, y);
        } else if (r < (x + ns) && c >= (y + ns)) {// 1사분면
            result += ns * ns;
            recursion(ns, x, (y + ns));
        } else if (r >= (x + ns) && c < (y + ns)) { // 2사분면
            result += (ns * ns) * 2;
            recursion(ns, (x + ns), y);
        } else { // 4사분면
            result += (ns * ns) * 3;
            recursion(ns, (x + ns), (y + ns));
        }
    }
}
