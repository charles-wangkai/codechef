import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int P = sc.nextInt();

      System.out.println(solve(N, X, P) ? "PASS" : "FAIL");
    }

    sc.close();
  }

  static boolean solve(int N, int X, int P) {
    return 3 * X - (N - X) >= P;
  }
}
