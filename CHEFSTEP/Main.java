import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] D = new int[N];
            for (int i = 0; i < D.length; ++i) {
                D[i] = sc.nextInt();
            }

            System.out.println(solve(D, K));
        }

        sc.close();
    }

    static String solve(int[] D, int K) {
        return Arrays.stream(D).mapToObj(x -> (x % K == 0) ? "1" : "0").collect(Collectors.joining());
    }
}