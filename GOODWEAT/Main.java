import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int[] A = new int[7];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int[] A) {
    return Arrays.stream(A).sum() >= 4;
  }
}
