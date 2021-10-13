import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(N, X, Y) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int N, int X, int Y) {
    return (N + 1) * Y >= X;
  }
}
