import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int E = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(E, K));
    }

    sc.close();
  }

  static int solve(int E, int K) {
    int result = 0;
    while (E != 0) {
      ++result;
      E /= K;
    }

    return result;
  }
}
