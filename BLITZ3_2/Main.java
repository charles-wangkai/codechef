import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();

      System.out.println(solve(N, A, B));
    }

    sc.close();
  }

  static int solve(int N, int A, int B) {
    return (180 + (N + 1) / 2 * 2 - A) + (180 + N / 2 * 2 - B);
  }
}
