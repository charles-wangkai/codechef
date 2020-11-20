import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int[] C = new int[N];
      for (int i = 0; i < C.length; ++i) {
        C[i] = sc.nextInt();
      }

      System.out.println(solve(C));
    }

    sc.close();
  }

  static int solve(int[] C) {
    int result = Integer.MAX_VALUE;
    for (int code = 0; code < 1 << C.length; ++code) {
      int[] times = new int[2];
      for (int i = 0; i < C.length; ++i) {
        times[((code & (1 << i)) == 0) ? 0 : 1] += C[i];
      }

      result = Math.min(result, Math.max(times[0], times[1]));
    }

    return result;
  }
}
