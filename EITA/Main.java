import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int d = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();

      System.out.println(solve(d, x, y, z));
    }

    sc.close();
  }

  static int solve(int d, int x, int y, int z) {
    return Math.max(x * 7, y * d + z * (7 - d));
  }
}
