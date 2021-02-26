import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] s = new int[N];
      for (int i = 0; i < s.length; ++i) {
        s[i] = sc.nextInt();
      }

      System.out.println(solve(s, K));
    }

    sc.close();
  }

  static int solve(int[] s, int K) {
    int[] sorted = Arrays.stream(s).boxed().sorted().mapToInt(x -> x).toArray();

    return IntStream.range(0, s.length - K + 1)
        .map(i -> sorted[i + K - 1] - sorted[i])
        .min()
        .getAsInt();
  }
}
