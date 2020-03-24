import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            String S = sc.next();

            System.out.println(solve(S) ? "WIN" : "LOSE");
        }

        sc.close();
    }

    static boolean solve(String S) {
        char[] cards = S.toCharArray();
        int index = 0;
        while (index != cards.length) {
            while (index != cards.length && cards[index] == '0') {
                ++index;
            }

            if (index == cards.length) {
                return false;
            }

            if (index + 1 != cards.length) {
                cards[index + 1] = (char) ('0' + '1' - cards[index + 1]);
            }
            ++index;
        }

        return true;
    }
}