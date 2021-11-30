import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int[] B = new int[2 * N];
      for (int i = 0; i < B.length; ++i) {
        B[i] = sc.nextInt();
      }

      System.out.println(solve(B));
    }

    sc.close();
  }

  static String solve(int[] B) {
    int[] A = Arrays.stream(B).boxed().sorted().mapToInt(x -> x).distinct().toArray();
    if (A.length * 2 != B.length) {
      return "-1";
    }

    Map<Integer, Integer> valueToCount = new HashMap<>();
    for (int i = 0; i < A.length; ++i) {
      valueToCount.put(A[i / 2], valueToCount.getOrDefault(A[i / 2], 0) + 1);
      valueToCount.put(
          A[(i + A.length - 1) / 2], valueToCount.getOrDefault(A[(i + A.length - 1) / 2], 0) + 1);
    }

    for (int value : B) {
      if (valueToCount.getOrDefault(value, 0) == 0) {
        return "-1";
      }

      valueToCount.put(value, valueToCount.get(value) - 1);
    }

    return Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" "));
  }
}
