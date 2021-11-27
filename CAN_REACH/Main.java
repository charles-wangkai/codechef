import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(x, y, K) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int x, int y, int K) {
    return x % K == 0 && y % K == 0;
  }
}
