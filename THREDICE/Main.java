import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(String.format("%.9f", solve(X, Y)));
    }

    sc.close();
  }

  static double solve(int X, int Y) {
    double result = 0;
    for (int i = 1; i <= 6; ++i) {
      if (i > X + Y) {
        result += 1.0 / 6;
      }
    }

    return result;
  }
}
