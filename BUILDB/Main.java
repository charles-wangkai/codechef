import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int R = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }
      int[] B = new int[N];
      for (int i = 0; i < B.length; ++i) {
        B[i] = sc.nextInt();
      }

      System.out.println(solve(A, B, R));
    }

    sc.close();
  }

  static long solve(int[] A, int[] B, int R) {
    long result = 0;
    long tension = 0;
    for (int i = 0; i < A.length; ++i) {
      if (i != 0) {
        tension = Math.max(0, tension - (long) R * (A[i] - A[i - 1]));
      }

      tension += B[i];
      result = Math.max(result, tension);
    }

    return result;
  }
}
