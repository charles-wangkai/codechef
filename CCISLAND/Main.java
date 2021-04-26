import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int xr = sc.nextInt();
      int yr = sc.nextInt();
      int D = sc.nextInt();

      System.out.println(solve(x, y, xr, yr, D) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int x, int y, int xr, int yr, int D) {
    return xr * D <= x && yr * D <= y;
  }
}
