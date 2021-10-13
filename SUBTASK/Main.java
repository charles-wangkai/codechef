import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int K = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, M, K));
    }

    sc.close();
  }

  static int solve(int[] A, int M, int K) {
    if (Arrays.stream(A).allMatch(Ai -> Ai == 1)) {
      return 100;
    } else if (Arrays.stream(A).limit(M).allMatch(Ai -> Ai == 1)) {
      return K;
    }

    return 0;
  }
}
