import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 1; tc <= T; ++tc) {
      int X = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();

      System.out.println(solve(X, A, B));
    }

    sc.close();
  }

  static int solve(int X, int A, int B) {
    return ((100 - X) * B + A) * 10;
  }
}
