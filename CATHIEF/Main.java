import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int K = sc.nextInt();
      int N = sc.nextInt();

      System.out.println(solve(x, y, K, N) ? "Yes" : "No");
    }

    sc.close();
  }

  static boolean solve(int x, int y, int K, int N) {
    return (x - y) % K == 0 && (x - y) / K % 2 == 0;
  }
}
