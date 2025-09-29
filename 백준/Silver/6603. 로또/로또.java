import java.util.*;
import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int k;
    static int[] s;
    static int[] result = new int[6];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        while (k != 0) {
            s = new int[k];
            for (int i = 0; i < k; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }
            recursion(0, 0);
            sb.append('\n');
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
        }
        System.out.println(sb);
    }

    public static void recursion(int start, int count) {
        if (count == 6) {
            for (int num : result) {
                sb.append(num + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < k; i++) {
            result[count] = s[i];
            recursion(i + 1, count + 1);
        }
    }
}
