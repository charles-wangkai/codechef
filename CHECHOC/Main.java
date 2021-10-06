// https://discuss.codechef.com/t/chechoc-editorial/72966

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(N, M, X, Y));
    }

    sc.close();
  }

  static int solve(int N, int M, int X, int Y) {
    if (N == 1 && M == 1) {
      return X;
    }

    int upper = Math.min(X, Y);
    int lower = Math.min(2 * X, Y) - upper;

    return (N * M + 1) / 2 * upper + N * M / 2 * lower;
  }
}
