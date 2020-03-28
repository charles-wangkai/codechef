import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(solve(A, B));
        }

        sc.close();
    }

    static int solve(int A, int B) {
        int result = A + B;
        if (A >= 10) {
            result = Math.max(result, Integer.parseInt(String.format("%d%d", B % 10, A % 10))
                    + Integer.parseInt(String.format("%d%d", B / 10, A / 10)));
        }
        if (B >= 10) {
            result = Math.max(result, Integer.parseInt(String.format("%d%d", A / 10, B / 10))
                    + Integer.parseInt(String.format("%d%d", A % 10, B % 10)));
        }

        return result;
    }
}