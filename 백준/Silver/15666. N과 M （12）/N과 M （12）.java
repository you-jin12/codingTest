import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[] arr, result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        result = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        recursion(0, 0);
        System.out.println(sb);

    }

    public static void recursion(int start, int count) {

        if (count == m) {
            for (int num : result) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        int prev = -1;
        for (int i = start; i < n; i++) {
            if (prev == arr[i]) {
                continue;
            }
            result[count] = arr[i];
            prev = arr[i];
            recursion(i, count + 1);
        }
    }

}
