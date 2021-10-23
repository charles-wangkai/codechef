import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(X, K));
    }

    sc.close();
  }

  static String solve(int X, int K) {
    return String.format("%d %d", X * 2, (X * K - 1L) * X * K);
  }
}
