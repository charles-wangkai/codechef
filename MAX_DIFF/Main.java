import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int S = sc.nextInt();

      System.out.println(solve(N, S));
    }

    sc.close();
  }

  static int solve(int N, int S) {
    return S - 2 * Math.max(0, S - N);
  }
}
