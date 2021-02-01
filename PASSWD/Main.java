import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      String S = sc.next();

      System.out.println(solve(S) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(String S) {
    return S.chars().anyMatch(Character::isLowerCase)
        && IntStream.range(1, S.length() - 1).anyMatch(i -> Character.isUpperCase(S.charAt(i)))
        && IntStream.range(1, S.length() - 1).anyMatch(i -> Character.isDigit(S.charAt(i)))
        && IntStream.range(1, S.length() - 1).anyMatch(i -> "@#%&?".indexOf(S.charAt(i)) >= 0)
        && S.length() >= 10;
  }
}
