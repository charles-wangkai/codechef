import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int D = sc.nextInt();

      System.out.println(solve(N, D));
    }

    sc.close();
  }

  static int solve(int N, int D) {
    int result = 1;
    for (int i = 0; i < D && result != N; ++i) {
      result = Math.min(N, result * ((i <= 9) ? 2 : 3));
    }

    return result;
  }
}
