import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x = sc.nextInt();
      int m = sc.nextInt();
      int d = sc.nextInt();

      System.out.println(solve(x, m, d));
    }

    sc.close();
  }

  static int solve(int x, int m, int d) {
    return Math.min(m * x, x + d);
  }
}
