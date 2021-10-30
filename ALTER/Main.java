import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int P = sc.nextInt();
      int Q = sc.nextInt();

      System.out.println(solve(A, B, P, Q) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int A, int B, int P, int Q) {
    return P % A == 0 && Q % B == 0 && Math.abs(P / A - Q / B) <= 1;
  }
}
