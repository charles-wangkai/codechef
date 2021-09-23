import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();

      System.out.println(solve(N));
    }

    sc.close();
  }

  static String solve(int N) {
    return (N == 1)
        ? "3"
        : String.format(
            "2%s1", IntStream.range(0, N - 2).mapToObj(i -> "0").collect(Collectors.joining()));
  }
}
