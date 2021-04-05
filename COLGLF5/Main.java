import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] F = new int[N];
      for (int i = 0; i < F.length; ++i) {
        F[i] = sc.nextInt();
      }
      int[] C = new int[M];
      for (int i = 0; i < C.length; ++i) {
        C[i] = sc.nextInt();
      }

      System.out.println(solve(F, C));
    }

    sc.close();
  }

  static int solve(int[] F, int[] C) {
    int result = 0;
    boolean footballOrCricket = true;
    int fIndex = 0;
    int cIndex = 0;
    while (fIndex != F.length || cIndex != C.length) {
      if (cIndex == C.length || (fIndex != F.length && F[fIndex] < C[cIndex])) {
        if (!footballOrCricket) {
          footballOrCricket = true;
          ++result;
        }

        ++fIndex;
      } else {
        if (footballOrCricket) {
          footballOrCricket = false;
          ++result;
        }

        ++cIndex;
      }
    }

    return result;
  }
}
