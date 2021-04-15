import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      sc.nextInt();
      int K = sc.nextInt();
      String S = sc.next();

      System.out.println(solve(S, K) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(String S, int K) {
    int count = 0;
    for (char ch : S.toCharArray()) {
      if (ch == '*') {
        ++count;
        if (count == K) {
          return true;
        }
      } else {
        count = 0;
      }
    }

    return false;
  }
}
