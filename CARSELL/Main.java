import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static final int MODULUS = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < P.length; ++i) {
                P[i] = sc.nextInt();
            }

            System.out.println(solve(P));
        }

        sc.close();
    }

    static int solve(int[] P) {
        int[] sorted = Arrays.stream(P).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).toArray();

        return IntStream.range(0, sorted.length).map(i -> Math.max(0, sorted[i] - i)).reduce(Main::addMod).getAsInt();
    }

    static int addMod(int x, int y) {
        return (x + y) % MODULUS;
    }
}