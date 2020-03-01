import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            char[] coins = new char[N];
            for (int i = 0; i < coins.length; ++i) {
                coins[i] = sc.next().charAt(0);
            }

            System.out.println(solve(coins, K));
        }

        sc.close();
    }

    static int solve(char[] coins, int K) {
        boolean flipped = false;
        int headCount = (int) IntStream.range(0, coins.length).filter(i -> coins[i] == 'H').count();
        int tailCount = coins.length - headCount;
        for (int i = coins.length - 1; i >= coins.length - K; --i) {
            boolean head = flipped != (coins[i] == 'H');
            if (head) {
                --headCount;

                int temp = headCount;
                headCount = tailCount;
                tailCount = temp;

                flipped = !flipped;
            } else {
                --tailCount;
            }
        }

        return headCount;
    }
}