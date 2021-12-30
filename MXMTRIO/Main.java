import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 1; tc <= T; ++tc) {
      int N = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A));
    }

    sc.close();
  }

  static long solve(int[] A) {
    int[] sorted = Arrays.stream(A).boxed().sorted().mapToInt(x -> x).toArray();

    return (long) (sorted[sorted.length - 1] - sorted[0]) * sorted[sorted.length - 2];
  }
}