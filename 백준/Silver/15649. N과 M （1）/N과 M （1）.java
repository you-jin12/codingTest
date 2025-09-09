import java.io.*;
import java.util.Scanner;

public class Main {
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        visit = new boolean[n];
        arr = new int[m];

        recursion(n, m, 0);
    }

    public static void recursion(int n, int m, int depth) {// 4 4 0 -> 4 4 1
        if (depth == m) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit[i] == false) {
                visit[i] = true;
                arr[depth] = i + 1;
                recursion(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
}
