import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int L = sc.nextInt();
      int X = sc.nextInt();

      System.out.println(solve(N, L, X));
    }

    sc.close();
  }

  static int solve(int N, int L, int X) {
    return Math.min(L, N - L) * X;
  }
}
