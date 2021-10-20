import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int[] B = new int[N];
      for (int i = 0; i < B.length; ++i) {
        B[i] = sc.nextInt();
      }

      System.out.println(solve(B));
    }

    sc.close();
  }

  static String solve(int[] B) {
    int[] sortedIndices =
        IntStream.range(0, B.length)
            .boxed()
            .sorted(Comparator.comparing(i -> B[i]))
            .mapToInt(x -> x)
            .toArray();

    int[] A = new int[B.length];
    int next = 0;
    for (int index : sortedIndices) {
      if (B[index] - 1 >= next) {
        A[index] = next;
        ++next;
      } else {
        A[index] = B[index] - 1;
      }
    }

    return Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" "));
  }
}
