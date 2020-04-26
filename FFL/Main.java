import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int LIMIT = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int S = sc.nextInt();
            int[] P = readArray(sc, N);
            int[] types = readArray(sc, N);

            System.out.println(solve(P, types, S) ? "yes" : "no");
        }

        sc.close();
    }

    static int[] readArray(Scanner sc, int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; ++i) {
            result[i] = sc.nextInt();
        }

        return result;
    }

    static boolean solve(int[] P, int[] types, int S) {
        int[] costs = new int[2];
        Arrays.fill(costs, LIMIT);

        for (int i = 0; i < P.length; ++i) {
            costs[types[i]] = Math.min(costs[types[i]], P[i]);
        }

        return S + Arrays.stream(costs).sum() <= LIMIT;
    }
}