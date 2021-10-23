import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(X, Y));
    }

    sc.close();
  }

  static int solve(int X, int Y) {
    return (X > Y) ? (X - Y) : ((Y - X + 1) / 2 + (Y - X) % 2);
  }
}
