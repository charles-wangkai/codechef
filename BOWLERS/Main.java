import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int L = sc.nextInt();

      System.out.println(solve(N, K, L));
    }

    sc.close();
  }

  static String solve(int N, int K, int L) {
    if (K * L < N || (K == 1 && N != 1)) {
      return "-1";
    }

    return IntStream.range(0, N)
        .mapToObj(i -> String.valueOf(i % K + 1))
        .collect(Collectors.joining(" "));
  }
}
