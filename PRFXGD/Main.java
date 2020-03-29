import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            String S = sc.next();
            int K = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(solve(S, K, X));
        }

        sc.close();
    }

    static int solve(String S, int K, int X) {
        Map<Character, Integer> letterToCount = new HashMap<>();
        int result = 0;
        for (char letter : S.toCharArray()) {
            if (letterToCount.getOrDefault(letter, 0) == X) {
                if (K == 0) {
                    break;
                }

                --K;
            } else {
                letterToCount.put(letter, letterToCount.getOrDefault(letter, 0) + 1);
                ++result;
            }
        }

        return result;
    }
}