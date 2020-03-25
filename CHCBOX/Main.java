import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] W = new int[N];
            for (int i = 0; i < W.length; ++i) {
                W[i] = sc.nextInt();
            }

            System.out.println(solve(W));
        }

        sc.close();
    }

    static int solve(int[] W) {
        int limit = Arrays.stream(W).max().getAsInt();
        Boolean[] happys = Arrays.stream(W).mapToObj(x -> x < limit).toArray(Boolean[]::new);

        int result = 0;
        int beginIndex = 0;
        int endIndex = W.length / 2 - 1;
        int badCount = (int) IntStream.range(0, W.length / 2).filter(i -> !happys[i]).count();
        for (int i = 0; i < happys.length; ++i) {
            if (badCount == 0) {
                ++result;
            }

            if (!happys[beginIndex]) {
                --badCount;
            }
            ++beginIndex;

            endIndex = (endIndex + 1) % happys.length;
            if (!happys[endIndex]) {
                ++badCount;
            }
        }

        return result;
    }
}