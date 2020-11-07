import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(N, K, X, Y) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int N, int K, int X, int Y) {
    boolean[] infected = new boolean[N];
    int current = X;
    while (!infected[current]) {
      infected[current] = true;
      if (current == Y) {
        return true;
      }

      current = (current + K) % infected.length;
    }

    return false;
  }
}
