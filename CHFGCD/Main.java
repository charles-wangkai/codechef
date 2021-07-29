import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(X, Y));
    }

    sc.close();
  }

  static int solve(int X, int Y) {
    if (gcd(X, Y) != 1) {
      return 0;
    }
    if (gcd(X + 1, Y) != 1 || gcd(X, Y + 1) != 1) {
      return 1;
    }

    return 2;
  }

  static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }
}
