import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            sc.nextInt();
            String S = sc.next();

            System.out.println(solve(S));
        }

        sc.close();
    }

    static String solve(String S) {
        int x = 0;
        int y = 0;
        char prev = 0;
        for (int i = 0; i < S.length(); ++i) {
            char curr = S.charAt(i);

            if (curr == 'L' && (prev != 'L' && prev != 'R')) {
                --x;
            } else if (curr == 'R' && (prev != 'L' && prev != 'R')) {
                ++x;
            } else if (curr == 'U' && (prev != 'U' && prev != 'D')) {
                ++y;
            } else if (curr == 'D' && (prev != 'U' && prev != 'D')) {
                --y;
            }

            prev = curr;
        }

        return String.format("%d %d", x, y);
    }
}