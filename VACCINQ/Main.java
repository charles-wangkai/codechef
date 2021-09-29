import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int P = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, P, X, Y));
    }

    sc.close();
  }

  static int solve(int[] A, int P, int X, int Y) {
    return IntStream.range(0, P).map(i -> (A[i] == 1) ? Y : X).sum();
  }
}
