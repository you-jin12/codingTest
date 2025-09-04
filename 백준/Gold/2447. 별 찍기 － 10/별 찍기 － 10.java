import java.util.*;
import java.io.*;

public class Main {

    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];
        drawStar(n, 0, 0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void drawStar(int n, int x, int y) {

        if (n == 1) {
            arr[x][y] = "*";
            return;
        }

        int newSize = n / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((x + i * newSize) == (newSize + x) && (y + j * newSize) == (newSize + y)) {
                    drawBlank(newSize, (x + i * newSize), (y + j * newSize));
                    continue;
                } // 가운데
                drawStar(newSize, (x + i * newSize), (y + j * newSize));
            }
        }
    }

    public static void drawBlank(int n, int x, int y) {
        for (int i = x; i < (x + n); i++) {
            for (int j = y; j < (y + n); j++) {
                arr[i][j] = " ";
            }
        }
    }
}
