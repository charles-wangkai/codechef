import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      String S = sc.next();

      System.out.println(solve(S, A, B));
    }

    sc.close();
  }

  static int solve(String S, int A, int B) {
    return S.chars().map(ch -> (ch == '0') ? A : B).sum();
  }
}
