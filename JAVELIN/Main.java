import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int X = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, M, X));
    }

    sc.close();
  }

  static String solve(int[] A, int M, int X) {
    int[] sortedIndices =
        IntStream.range(0, A.length)
            .boxed()
            .sorted(Comparator.comparing((Integer i) -> A[i]).reversed())
            .mapToInt(x -> x)
            .toArray();

    List<Integer> qualified = new ArrayList<>();
    for (int index : sortedIndices) {
      if (A[index] >= M || qualified.size() < X) {
        qualified.add(index + 1);
      }
    }
    Collections.sort(qualified);

    return String.format(
        "%d %s",
        qualified.size(), qualified.stream().map(String::valueOf).collect(Collectors.joining(" ")));
  }
}
