import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; ++i) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }

            System.out.println(solve(A, B));
        }

        sc.close();
    }

    static String solve(int[] A, int[] B) {
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < A.length; ++i) {
            int digitSumA = computeDigitSum(A[i]);
            int digitSumB = computeDigitSum(B[i]);

            if (digitSumA <= digitSumB) {
                ++scoreB;
            }
            if (digitSumA >= digitSumB) {
                ++scoreA;
            }
        }

        if (scoreA < scoreB) {
            return String.format("1 %d", scoreB);
        } else if (scoreA > scoreB) {
            return String.format("0 %d", scoreA);
        } else {
            return String.format("2 %d", scoreA);
        }
    }

    static int computeDigitSum(int x) {
        return String.valueOf(x).chars().map(ch -> ch - '0').sum();
    }
}