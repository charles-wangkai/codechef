import java.util.Scanner;

public class Main {
    static final int MODULUS = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] B = new int[N];
            for (int i = 0; i < B.length; ++i) {
                B[i] = sc.nextInt();
            }

            System.out.println(solve(B));
        }

        sc.close();
    }

    static int solve(int[] B) {
        int result = 1;
        int prev = 0;
        for (int Bi : B) {
            if ((Bi & prev) != prev) {
                return 0;
            }

            result = multiplyMod(result, 1 << Integer.bitCount(prev));

            prev = Bi;
        }

        return result;
    }

    static int multiplyMod(int x, int y) {
        return (int) ((long) x * y % MODULUS);
    }
}