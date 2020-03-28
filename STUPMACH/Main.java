import java.util.Scanner;

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
        long result = 0;
        int capacity = Integer.MAX_VALUE;
        for (int Si : S) {
            capacity = Math.min(capacity, Si);
            result += capacity;
        }

        return result;
    }
}