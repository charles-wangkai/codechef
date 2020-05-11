import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < X.length; ++i) {
                X[i] = sc.nextInt();
            }

            System.out.println(solve(X));
        }

        sc.close();
    }

    static String solve(int[] X) {
        int minSize = Integer.MAX_VALUE;
        int maxSize = Integer.MIN_VALUE;
        int size = 1;
        for (int i = 1; i <= X.length; ++i) {
            if (i < X.length && X[i] - X[i - 1] <= 2) {
                ++size;
            } else {
                minSize = Math.min(minSize, size);
                maxSize = Math.max(maxSize, size);

                size = 1;
            }
        }

        return String.format("%d %d", minSize, maxSize);
    }
}