import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int M = sc.nextInt();
      int N = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(M, N, K) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int M, int N, int K) {
    return M > N * K;
  }
}
