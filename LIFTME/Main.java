import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int[] f = new int[Q];
            int[] d = new int[Q];
            for (int i = 0; i < Q; ++i) {
                f[i] = sc.nextInt();
                d[i] = sc.nextInt();
            }

            System.out.println(solve(N, f, d));
        }

        sc.close();
    }

    static long solve(int N, int[] f, int[] d) {
        return IntStream.range(0, f.length).map(i -> Math.abs(f[i] - (i == 0 ? 0 : d[i - 1])) + Math.abs(d[i] - f[i]))
                .asLongStream().sum();
    }
}