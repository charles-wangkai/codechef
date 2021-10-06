import java.util.Scanner;

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
    int badCount = 0;
    int goodCount = 0;
    for (char ch : S.toCharArray()) {
      if (ch == '0') {
        ++badCount;
      } else {
        ++goodCount;
        if (goodCount >= badCount) {
          return true;
        }
      }
    }

    return false;
  }
}
