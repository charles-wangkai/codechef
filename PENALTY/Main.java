import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int[] A = new int[10];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A));
    }

    sc.close();
  }

  static int solve(int[] A) {
    int score1 = A[0] + A[2] + A[4] + A[6] + A[8];
    int score2 = A[1] + A[3] + A[5] + A[7] + A[9];

    if (score1 > score2) {
      return 1;
    } else if (score1 < score2) {
      return 2;
    }

    return 0;
  }
}
