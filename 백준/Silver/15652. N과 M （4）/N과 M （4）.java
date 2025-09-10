import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        recursion(1, 0);
        System.out.print(sb);
    }

    public static void recursion(int start, int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            recursion(arr[depth], depth + 1);
        }
    }
}