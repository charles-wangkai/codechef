import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      sc.nextInt();
      int K = sc.nextInt();
      String S = sc.next();

      System.out.println(solve(S, K));
    }

    sc.close();
  }

  static int solve(String S, int K) {
    int result = 0;
    int count = 0;
    for (char ch : S.toCharArray()) {
      if (ch == '0') {
        ++count;
        if (count == K) {
          count = 0;
          ++result;
        }
      } else {
        count = 0;
      }
    }

    return result;
  }
}
