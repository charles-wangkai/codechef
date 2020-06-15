import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < P.length; ++i) {
                P[i] = sc.nextInt();
            }

            System.out.println(solve(P, K));
        }

        sc.close();
    }

    static int solve(int[] P, int K) {
        return Arrays.stream(P).map(x -> Math.max(0, x - K)).sum();
    }
}