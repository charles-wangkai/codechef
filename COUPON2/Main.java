import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int D = sc.nextInt();
      int C = sc.nextInt();
      int[] A = new int[3];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }
      int[] B = new int[3];
      for (int i = 0; i < B.length; ++i) {
        B[i] = sc.nextInt();
      }

      System.out.println(solve(D, C, A, B) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int D, int C, int[] A, int[] B) {
    return C + (Arrays.stream(A).sum() >= 150 ? 0 : D) + (Arrays.stream(B).sum() >= 150 ? 0 : D)
        < 2 * D;
  }
}
