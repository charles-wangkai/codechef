import java.util.Scanner;

public class Main {
  static final int LIMIT = 100;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A));
    }

    sc.close();
  }

  static int solve(int[] A) {
    int[] counts = new int[LIMIT + 1];
    for (int score : A) {
      ++counts[score];
    }

    int result = 0;
    int greaterNum = 0;
    for (int i = counts.length - 1; i >= 0; --i) {
      if (A.length - greaterNum > greaterNum) {
        result += counts[i];
      }
      greaterNum += counts[i];
    }

    return result;
  }
}
