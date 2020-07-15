import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] S = new int[N];
            for (int i = 0; i < S.length; ++i) {
                S[i] = sc.nextInt();
            }

            System.out.println(solve(S));
        }

        sc.close();
    }

    static long solve(int[] S) {
        return IntStream.range(0, S.length - 1).map(i -> Math.abs(S[i + 1] - S[i]) - 1).asLongStream().sum();
    }
}