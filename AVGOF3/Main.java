import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();

      System.out.println(solve(X));
    }

    sc.close();
  }

  static String solve(int X) {
    return String.format("%d %d %d", X - 1, X, X + 1);
  }
}