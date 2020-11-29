import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int[][] T = new int[N][K];
    int[] Q = new int[N];
    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < K; ++j) {
        T[i][j] = sc.nextInt();
      }

      Q[i] = sc.nextInt();
    }
    System.out.println(solve(T, Q, M));

    sc.close();
  }

  static int solve(int[][] T, int[] Q, int M) {
    return (int)
        IntStream.range(0, T.length)
            .filter(i -> Arrays.stream(T[i]).sum() >= M && Q[i] <= 10)
            .count();
  }
}
