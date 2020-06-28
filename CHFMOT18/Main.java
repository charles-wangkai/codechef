import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int S = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(solve(S, N));
        }

        sc.close();
    }

    static int solve(int S, int N) {
        return (S - S % 2 + N - 1) / N + S % 2;
    }
}