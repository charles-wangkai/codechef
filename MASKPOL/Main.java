import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int A = sc.nextInt();

      System.out.println(solve(N, A));
    }

    sc.close();
  }

  static int solve(int N, int A) {
    return Math.min(A, N - A);
  }
}