import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      String s = sc.next();

      System.out.println(solve(s) ? "Success" : "Error");
    }

    sc.close();
  }

  static boolean solve(String s) {
    return s.startsWith("</")
        && s.endsWith(">")
        && s.length() >= 4
        && IntStream.range(2, s.length() - 1)
            .allMatch(
                i -> {
                  char ch = s.charAt(i);

                  return Character.isDigit(ch)
                      || (Character.isLetter(ch) && Character.isLowerCase(ch));
                });
  }
}
