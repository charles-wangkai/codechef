import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; ++i) {
                A[i] = sc.nextInt();
            }

            System.out.println(solve(A) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean solve(int[] A) {
        Set<Integer> values = new HashSet<>();
        Set<Integer> counts = new HashSet<>();
        int value = -1;
        int count = -1;
        for (int i = 0; i <= A.length; ++i) {
            if (i != A.length && A[i] == value) {
                ++count;
            } else {
                if (value != -1) {
                    if (values.contains(value) || counts.contains(count)) {
                        return false;
                    }

                    values.add(value);
                    counts.add(count);
                }

                if (i != A.length) {
                    value = A[i];
                    count = 1;
                }
            }
        }

        return true;
    }
}