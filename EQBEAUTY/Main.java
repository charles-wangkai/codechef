import java.util.Arrays;
import java.util.Scanner;

public class Main {
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

  static long solve(int[] A) {
    return Math.min(computeMoveNum(A), computeMoveNum(Arrays.stream(A).map(x -> -x).toArray()));
  }

  static long computeMoveNum(int[] a) {
    Arrays.sort(a);

    if (a.length == 2) {
      return 0;
    }
    if (a.length == 3) {
      return Math.min(a[1] - a[0], a[2] - a[1]);
    }

    long leftOnePointMoveNum = 0;
    for (int i = 0, j = a.length - 2; i < j; ++i, --j) {
      leftOnePointMoveNum += a[j] - a[i];
    }

    long rightOnePointMoveNum = 0;
    for (int i = 1, j = a.length - 1; i < j; ++i, --j) {
      rightOnePointMoveNum += a[j] - a[i];
    }

    long result = Math.min(leftOnePointMoveNum, rightOnePointMoveNum);

    int leftIndex = 1;
    int rightIndex = a.length - 2;
    while (leftIndex < rightIndex) {
      long leftDiff = a[rightIndex] - a[0];
      long rightDiff = a[a.length - 1] - a[leftIndex];
      result = Math.min(result, Math.abs(leftDiff - rightDiff));

      if (leftDiff <= rightDiff) {
        ++leftIndex;
      } else {
        --rightIndex;
      }
    }

    return result;
  }
}
