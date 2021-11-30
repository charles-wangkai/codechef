import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int S = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(S, A, B, C) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int S, int A, int B, int C) {
    return S * (100 + C) >= A * 100 && S * (100 + C) <= B * 100;
  }
}
