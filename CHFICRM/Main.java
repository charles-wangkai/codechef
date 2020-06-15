import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < a.length; ++i) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(a) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean solve(int[] a) {
        int count5 = 0;
        int count10 = 0;
        for (int ai : a) {
            if (ai == 5) {
                ++count5;
            } else if (ai == 10) {
                if (count5 == 0) {
                    return false;
                }

                --count5;
                ++count10;
            } else {
                if (count10 != 0) {
                    --count10;
                } else if (count5 >= 2) {
                    count5 -= 2;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}