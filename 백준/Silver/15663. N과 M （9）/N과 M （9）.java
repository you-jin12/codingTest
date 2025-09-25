import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] result, arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new int[m];
        arr = new int[n];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬
        recursion(0);
        System.out.println(sb);
    }

    public static void recursion(int count) {

        if (count == m) {
            for (int num : result) {
                sb.append(num + " ");
            }
            sb.append('\n');
            return;
        }

        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (prev == arr[i]) {
                continue;
            }
            if (visit[i]) {
                continue;
            }
            result[count] = arr[i];
            visit[i] = true;
            recursion(count + 1);
            visit[i] = false;
            prev = arr[i];
        }
    }
}
