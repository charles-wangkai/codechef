import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      System.out.println(solve(A, B));
    }

    sc.close();
  }

  static long solve(int A, int B) {
    int even1 = A / 2;
    int odd1 = (A + 1) / 2;
    int even2 = B / 2;
    int odd2 = (B + 1) / 2;

    return (long) even1 * even2 + (long) odd1 * odd2;
  }
}
