import java.util.Scanner;

public class Main {
  static final String FROM = "party";
  static final String TO = "pawri";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      String S = sc.next();

      System.out.println(solve(S));
    }

    sc.close();
  }

  static String solve(String S) {
    StringBuilder result = new StringBuilder();
    int index = 0;
    while (index != S.length()) {
      if (S.startsWith(FROM, index)) {
        result.append(TO);
        index += FROM.length();
      } else {
        result.append(S.charAt(index));
        ++index;
      }
    }

    return result.toString();
  }
}
