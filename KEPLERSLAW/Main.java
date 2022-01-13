import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int T1 = sc.nextInt();
      int T2 = sc.nextInt();
      int R1 = sc.nextInt();
      int R2 = sc.nextInt();

      System.out.println(solve(T1, T2, R1, R2) ? "Yes" : "No");
    }

    sc.close();
  }

  static boolean solve(int T1, int T2, int R1, int R2) {
    return T1 * T1 * R2 * R2 * R2 == T2 * T2 * R1 * R1 * R1;
  }
}