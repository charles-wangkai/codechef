import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();

      System.out.println(solve(x, y, z) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int x, int y, int z) {
    return x + y == z || y + z == x || z + x == y;
  }
}
