import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; ++i) {
                A[i] = sc.nextInt();
            }

            System.out.println(solve(A));
        }

        sc.close();
    }

    static int solve(int[] A) {
        Map<Integer, Integer> typeToCount = new HashMap<>();
        for (int i = 0; i < A.length; ++i) {
            if (i != 0 && A[i] == A[i - 1]) {
                A[i] = -1;
            } else {
                typeToCount.put(A[i], typeToCount.getOrDefault(A[i], 0) + 1);
            }
        }

        int maxCount = typeToCount.values().stream().mapToInt(x -> x).max().getAsInt();

        return typeToCount.keySet().stream().filter(type -> typeToCount.get(type) == maxCount).mapToInt(x -> x).min()
                .getAsInt();
    }
}