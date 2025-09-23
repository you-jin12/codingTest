import java.io.*;
import java.util.*;

public class Main {
    static int[] power;
    static int[] weight;
    static int result = 0;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        power = new int[n];
        weight = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            power[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        recursion(0);
        System.out.println(result);
    }

    public static void recursion(int pick) {
        if (pick == n) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (power[i] <= 0) {
                    count++;
                }
            }
            result = Math.max(result, count);
            return;
        }

        if (power[pick] <= 0) {
            recursion(pick + 1);
            return;
        }

        boolean hit = false;
        for (int i = 0; i < n; i++) {

            if (pick == i || power[i] <= 0) {
                continue;
            }

            hit = true; // 깰 계란이 있으면
            power[pick] -= weight[i];
            power[i] -= weight[pick];

            recursion(pick + 1);

            power[pick] += weight[i];
            power[i] += weight[pick];

        }

        if (hit == false)
            recursion(pick + 1); // 마지막까지 깰 계란이 없으면
    }
}