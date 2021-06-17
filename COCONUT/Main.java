import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int xa = sc.nextInt();
      int xb = sc.nextInt();
      int Xa = sc.nextInt();
      int Xb = sc.nextInt();

      System.out.println(solve(xa, xb, Xa, Xb));
    }

    sc.close();
  }

  static int solve(int xa, int xb, int Xa, int Xb) {
    return Xa / xa + Xb / xb;
  }
}
