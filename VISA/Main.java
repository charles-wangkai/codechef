import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y1 = sc.nextInt();
      int y2 = sc.nextInt();
      int z1 = sc.nextInt();
      int z2 = sc.nextInt();

      System.out.println(solve(x1, x2, y1, y2, z1, z2) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int x1, int x2, int y1, int y2, int z1, int z2) {
    return x2 >= x1 && y2 >= y1 && z2 <= z1;
  }
}
