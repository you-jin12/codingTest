import java.util.*;
import java.io.*;

public class Main {
    static String result = "";
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        recursion(0, 0, n);
        System.out.println(result);

    }

    public static void recursion(int x, int y, int size) {
        if (isSame(x, y, size)) {
            result += arr[x][y];
            return;
        }

        // 다르면
        int newSize = size / 2;
        result += "(";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                recursion(i * newSize + x, j * newSize + y, newSize);
            }
        }

        result += ")";

    }

    public static boolean isSame(int x, int y, int size) {
        int num = arr[x][y];

        for (int i = x; i < (size + x); i++) {
            for (int j = y; j < (size + y); j++) {
                if (num != arr[i][j])
                    return false;
            }
        }
        return true;
    }
}