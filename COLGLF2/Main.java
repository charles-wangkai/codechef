import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int S = sc.nextInt();
      int[] Q = new int[S];
      for (int i = 0; i < Q.length; ++i) {
        Q[i] = sc.nextInt();
      }
      int[][] L = new int[S][];
      for (int i = 0; i < L.length; ++i) {
        int E = sc.nextInt();
        L[i] = new int[E];
        for (int j = 0; j < L[i].length; ++j) {
          L[i][j] = sc.nextInt();
        }
      }

      System.out.println(solve(Q, L));
    }

    sc.close();
  }

  static long solve(int[] Q, int[][] L) {
    return Arrays.stream(Q).asLongStream().sum()
        + IntStream.range(0, L.length)
            .mapToLong(i -> Arrays.stream(L[i]).map(x -> x - Q[i]).asLongStream().sum())
            .sum();
  }
}
