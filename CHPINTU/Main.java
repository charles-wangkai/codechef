import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] F = readArray(sc, N);
            int[] P = readArray(sc, N);

            System.out.println(solve(F, P, M));
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

    static int solve(int[] F, int[] P, int M) {
        Map<Integer, Integer> typeToCost = new HashMap<>();
        for (int i = 0; i < F.length; ++i) {
            typeToCost.put(F[i], typeToCost.getOrDefault(F[i], 0) + P[i]);
        }

        return typeToCost.values().stream().mapToInt(x -> x).min().getAsInt();
    }
}