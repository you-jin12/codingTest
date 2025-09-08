import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static char arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][2 * n - 1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                arr[i][j] = ' ';
            }
        }

        recursion(n, 0, (2 * n - 1) / 2);

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void recursion(int size, int x, int y) {

        if (size == 3) {
            draw(x, y);
            return;
        }

        int ns = size / 2;

        recursion(ns, x, y);
        recursion(ns, x + ns, y - (2 * ns / 2));
        recursion(ns, x + ns, y + (2 * ns / 2));
    }

    public static void draw(int x, int y) {
        arr[x][y] = '*';
        arr[x + 1][y + 1] = '*';
        arr[x + 1][y - 1] = '*';

        for (int i = y - 2; i <= y + 2; i++) {
            arr[x + 2][i] = '*';
        }
    }
}
