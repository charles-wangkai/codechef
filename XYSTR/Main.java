import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            String S = sc.next();

            System.out.println(solve(S));
        }

        sc.close();
    }

    static int solve(String S) {
        int result = 0;
        int index = 0;
        while (index != S.length()) {
            if (index + 1 != S.length() && S.charAt(index) != S.charAt(index + 1)) {
                index += 2;
                ++result;
            } else {
                ++index;
            }
        }

        return result;
    }
}