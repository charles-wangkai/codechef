import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      double k1 = sc.nextDouble();
      double k2 = sc.nextDouble();
      double k3 = sc.nextDouble();
      double v = sc.nextDouble();

      System.out.println(solve(k1, k2, k3, v) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(double k1, double k2, double k3, double v) {
    return Math.round(100 / k1 / k2 / k3 / v * 100) < 958;
  }
}
