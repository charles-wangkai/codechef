import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      sc.nextInt();
      String S = sc.next();

      System.out.println(solve(S) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(String S) {
    return IntStream.range(0, S.length() - 1)
        .anyMatch(i -> S.charAt(i) == S.charAt(S.length() - 1));
  }
}
