import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();
      String S = sc.next();

      System.out.println(solve(X, Y, S));
    }

    sc.close();
  }

  static int solve(int X, int Y, String S) {
    int maxOneLength = 0;
    int oneLength = 0;
    for (char ch : S.toCharArray()) {
      if (ch == '0') {
        oneLength = 0;
      } else {
        ++oneLength;
        maxOneLength = Math.max(maxOneLength, oneLength);
      }
    }

    return (int) S.chars().filter(ch -> ch == '1').count() * X + Y * maxOneLength;
  }
}
