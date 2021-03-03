import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int[] A = new int[11];
      for (int i = 1; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }
      int K = sc.nextInt();

      System.out.println(solve(A, K));
    }

    sc.close();
  }

  static int solve(int[] A, int K) {
    for (int i = A.length - 1; i >= 1; --i) {
      int removed = Math.min(A[i], K);
      A[i] -= removed;
      K -= removed;
    }

    return IntStream.range(1, A.length).filter(i -> A[i] != 0).max().getAsInt();
  }
}
