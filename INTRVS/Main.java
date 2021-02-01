import java.util.Arrays;
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

  static String solve(int[] A, int K) {
    if (Arrays.stream(A).filter(x -> x != -1).count() < (A.length + 1) / 2) {
      return "Rejected";
    }
    if (Arrays.stream(A).max().getAsInt() > K) {
      return "Too Slow";
    }
    if (Arrays.stream(A).allMatch(x -> x != -1 && x <= 1)) {
      return "Bot";
    }

    return "Accepted";
  }
}
