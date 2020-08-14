import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; ++i) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(a));
        }

        sc.close();
    }

    static String solve(int[] a) {
        long firstScore = 0;
        long secondScore = 0;
        int[] sorted = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x).toArray();
        for (int i = 0; i < sorted.length; ++i) {
            if (i == 0 || (i % 2 == 1 && i != 1)) {
                firstScore += sorted[i];
            } else {
                secondScore += sorted[i];
            }
        }

        if (firstScore > secondScore) {
            return "first";
        } else if (firstScore < secondScore) {
            return "second";
        } else {
            return "draw";
        }
    }
}