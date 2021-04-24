import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int H = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(H, x, y, C) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int H, int x, int y, int C) {
    return H * (x + y / 2) <= C;
  }
}
