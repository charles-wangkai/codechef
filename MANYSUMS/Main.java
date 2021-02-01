import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int L = sc.nextInt();
      int R = sc.nextInt();

      System.out.println(solve(L, R));
    }

    sc.close();
  }

  static int solve(int L, int R) {
    return 2 * R - 2 * L + 1;
  }
}
