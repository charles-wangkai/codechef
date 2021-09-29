import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(N, A, B, C) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int N, int A, int B, int C) {
    return Math.min(B, A + C) >= N;
  }
}
