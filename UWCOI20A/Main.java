import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] heights = new int[N];
            for (int i = 0; i < heights.length; ++i) {
                heights[i] = sc.nextInt();
            }

            System.out.println(solve(heights));
        }

        sc.close();
    }

    static int solve(int[] heights) {
        return Arrays.stream(heights).max().getAsInt();
    }
}