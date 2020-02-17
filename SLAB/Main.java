import java.util.Scanner;

public class Main {
    static final int[] LIMITS = { 250_000, 500_000, 750_000, 1_000_000, 1_250_000, 1_500_000, Integer.MAX_VALUE };
    static final int[] PERCENTAGES = { 0, 5, 10, 15, 20, 25, 30 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();

            System.out.println(solve(N));
        }

        sc.close();
    }

    static int solve(int N) {
        int result = 0;
        for (int i = 0; i < LIMITS.length; ++i) {
            int base = Math.min(N, LIMITS[i] - (i == 0 ? 0 : LIMITS[i - 1]));
            result += base / 100 * (100 - PERCENTAGES[i]);

            N -= base;
        }

        return result;
    }
}