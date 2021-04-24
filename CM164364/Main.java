import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] A = new int[n];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, x));
    }

    sc.close();
  }

  static int solve(int[] A, int x) {
    return Math.min(A.length - x, (int) Arrays.stream(A).distinct().count());
  }
}
