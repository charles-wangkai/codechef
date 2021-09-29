import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      long L = sc.nextLong();
      long R = sc.nextLong();

      System.out.println(solve(L, R));
    }

    sc.close();
  }

  static long solve(long L, long R) {
    return R / 3 - (L + 2) / 3 + 1;
  }
}
