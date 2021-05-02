import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int M = sc.nextInt();
      int S = sc.nextInt();

      System.out.println(solve(M, S));
    }

    sc.close();
  }

  static int solve(int M, int S) {
    return M / S;
  }
}
