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

      System.out.println(solve(A, B, P, Q));
    }

    sc.close();
  }

  static int solve(int A, int B, int P, int Q) {
    if ((A + B) % 2 != (P + Q) % 2) {
      return 1;
    }

    return (A == P && B == Q) ? 0 : 2;
  }
}
