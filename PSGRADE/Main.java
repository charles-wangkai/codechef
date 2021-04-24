import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int AMin = sc.nextInt();
      int BMin = sc.nextInt();
      int CMin = sc.nextInt();
      int TMin = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(AMin, BMin, CMin, TMin, A, B, C) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int AMin, int BMin, int CMin, int TMin, int A, int B, int C) {
    return A >= AMin && B >= BMin && C >= CMin && A + B + C >= TMin;
  }
}
