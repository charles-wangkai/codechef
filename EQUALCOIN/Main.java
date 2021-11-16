import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(X, Y) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int X, int Y) {
    return X % 2 == 0 && (Y % 2 == 0 || X != 0);
  }
}
