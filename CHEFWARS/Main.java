import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int H = sc.nextInt();
            int P = sc.nextInt();

            System.out.println(solve(H, P));
        }

        sc.close();
    }

    static int solve(int H, int P) {
        while (P != 0) {
            H -= P;
            if (H <= 0) {
                return 1;
            }

            P /= 2;
        }

        return 0;
    }
}