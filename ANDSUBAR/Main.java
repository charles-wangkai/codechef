import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();

      System.out.println(solve(N));
    }

    sc.close();
  }

  static int solve(int N) {
    int result = 0;
    for (long i = 1; i <= N; i <<= 1) {
      result = Math.max(result, (int) Math.min(i, N + 1 - i));
    }

    return result;
  }
}
