import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, K));
    }

    sc.close();
  }

  static long solve(int[] A, int K) {
    int[] sorted =
        Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();

    long cost1 = 0;
    long cost2 = sorted[2 * K];
    for (int i = 0; i < K; ++i) {
      cost1 += sorted[i * 2];
      cost2 += sorted[i * 2 + 1];
    }

    return Math.max(cost1, cost2);
  }
}
