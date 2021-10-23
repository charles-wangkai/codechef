import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(N, K));
    }

    sc.close();
  }

  static long solve(int N, int K) {
    return (N * (N - 1L) / 2 - (N - K) * (N - K - 1L) / 2) / K * 2;
  }
}
