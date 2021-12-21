import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X1 = sc.nextInt();
      int X2 = sc.nextInt();

      System.out.println(solve(X1, X2) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int X1, int X2) {
    return X1 >= X2;
  }
}
