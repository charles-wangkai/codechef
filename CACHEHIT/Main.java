import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int M = sc.nextInt();
            int[] x = new int[M];
            for (int i = 0; i < x.length; ++i) {
                x[i] = sc.nextInt();
            }

            System.out.println(solve(N, B, x));
        }

        sc.close();
    }

    static int solve(int N, int B, int[] x) {
        return (int) IntStream.range(0, x.length).filter(i -> i == 0 || x[i] / B != x[i - 1] / B).count();
    }
}