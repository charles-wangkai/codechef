import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(solve(a, b, c, d) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean solve(int a, int b, int c, int d) {
        return a == b || (c != d && (a - b) % (c - d) == 0);
    }
}