import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int[] A = new int[5];
            for (int i = 0; i < A.length; ++i) {
                A[i] = sc.nextInt();
            }
            int P = sc.nextInt();

            System.out.println(solve(A, P) ? "Yes" : "No");
        }

        sc.close();
    }

    static boolean solve(int[] A, int P) {
        return Arrays.stream(A).sum() * P > 120;
    }
}