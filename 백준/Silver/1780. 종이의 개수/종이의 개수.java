import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] count = new int[3]; // -1,0,1
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursive(0, 0, n);
        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[2]);

    }

    public static void recursive(int x, int y, int size) {

        if (isSame(x, y, size)) {
            // 모두 같다면 해당 숫자 카운트 후 리턴
            count[arr[x][y] + 1]++;
            return;
        }

        // 다를 경우
        int newSize = size / 3; // 3등분
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                recursive(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    public static boolean isSame(int x, int y, int size) {

        int num = arr[x][y];// 비교 대상
        for (int i = x; i < (x + size); i++) {
            for (int j = y; j < (y + size); j++) {
                if (arr[i][j] != num)
                    return false;
            }
        }
        return true;
    }
}
