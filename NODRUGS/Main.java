import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int L = sc.nextInt();
      int[] S = new int[N];
      for (int i = 0; i < S.length; ++i) {
        S[i] = sc.nextInt();
      }

      System.out.println(solve(S, K, L) ? "Yes" : "No");
    }

    sc.close();
  }

  static boolean solve(int[] S, int K, int L) {
    int N = S.length;

    int maxOther = IntStream.range(0, N - 1).map(i -> S[i]).max().orElse(-1);
    if (S[N - 1] > maxOther) {
      return true;
    }
    if (K <= 0) {
      return false;
    }

    return (maxOther + 1 - S[N - 1] + K - 1) / K < L;
  }
}
