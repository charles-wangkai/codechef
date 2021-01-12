import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
    return IntStream.range(0, S.length() / 4)
        .mapToObj(
            i -> String.valueOf((char) (Integer.parseInt(S.substring(i * 4, i * 4 + 4), 2) + 'a')))
        .collect(Collectors.joining());
  }
}
