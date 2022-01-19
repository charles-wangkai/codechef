import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, X));
    }

    sc.close();
  }

  static int solve(int[] A, int X) {
    int[] sorted =
        Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();

    int sum = 0;
    for (int i = 0; i < sorted.length; ++i) {
      sum += sorted[i];
      if (sum >= X) {
        return i + 1;
      }
    }

    return -1;
  }
}
