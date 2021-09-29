import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
    if (N % 4 == 2) {
      return "NO";
    }

    List<Integer> A = new ArrayList<>();
    List<Integer> B = new ArrayList<>();
    for (int i = 1, j = N; i < j; i += 2, j -= 2) {
      A.add(i);
      A.add(j);
      B.add(i + 1);
      B.add(j - 1);
    }
    Collections.sort(A);
    Collections.sort(B);

    return String.format(
        "YES\n%s\n%s",
        A.stream().map(String::valueOf).collect(Collectors.joining(" ")),
        B.stream().map(String::valueOf).collect(Collectors.joining(" ")));
  }
}
