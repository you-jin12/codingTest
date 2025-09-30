import java.io.*;
import java.util.*;

public class Main {
    static int l, c;
    static char[] arr, result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[c];
        result = new char[l];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        recursion(0, 0);
        System.out.println(sb);
    }

    public static void recursion(int start, int count) {

        if (count == l) {
            int vCount = 0;
            for (char c : result) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vCount++;
                }
            }
            if (vCount < 1 || ((l - vCount) < 2)) {
                return;
            }
            for (char c : result) {
                sb.append(c);
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < c; i++) {
            result[count] = arr[i];
            recursion(i + 1, count + 1);
        }
    }

}
