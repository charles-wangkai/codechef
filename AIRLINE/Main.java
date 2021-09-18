import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      int E = sc.nextInt();

      System.out.println(solve(A, B, C, D, E) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int A, int B, int C, int D, int E) {
    return (A + B <= D && C <= E) || (B + C <= D && A <= E) || (C + A <= D && B <= E);
  }
}
