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

  static String solve(String S) {
    int[] counts = new int[2];
    for (char ch : S.toCharArray()) {
      if (ch != '?') {
        ++counts[ch - '0'];
      }
    }

    char[] result = S.toCharArray();
    for (int i = 0; i < result.length; ++i) {
      if (result[i] == '?') {
        if (counts[0] <= counts[1]) {
          result[i] = '0';
          ++counts[0];
        } else {
          result[i] = '1';
          ++counts[1];
        }
      }
    }

    return new String(result);
  }
}
