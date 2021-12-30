import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      sc.nextInt();
      String S = sc.next();

      System.out.println(solve(S));
    }

    sc.close();
  }

  static int solve(String S) {
    int[] counts = new int[2];
    for (char ch : S.toCharArray()) {
      ++counts[ch - '0'];
    }

    return Math.max(0, Math.min(counts[0], counts[1]) - 1);
  }
}
