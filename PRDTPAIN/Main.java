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
    long result = 0;
    for (int i = 0; i < A.length; ++i) {
      for (int j = i + 2; j < A.length; ++j) {
        result +=
            Math.max(
                computeWeight(A[i], A[j], findLower(A, A[i] + A[j])),
                computeWeight(A[i], A[j], findUpper(A, A[i] + A[j])));
      }
    }

    return result;
  }

  static int findLower(int[] A, int doubleTarget) {
    int result = A[0];
    int lower = 0;
    int upper = A.length - 1;
    while (lower <= upper) {
      int middle = (lower + upper) / 2;
      if (A[middle] * 2 <= doubleTarget) {
        result = A[middle];
        lower = middle + 1;
      } else {
        upper = middle - 1;
      }
    }

    return result;
  }

  static int findUpper(int[] A, int doubleTarget) {
    int result = A[A.length - 1];
    int lower = 0;
    int upper = A.length - 1;
    while (lower <= upper) {
      int middle = (lower + upper) / 2;
      if (A[middle] * 2 >= doubleTarget) {
        result = A[middle];
        upper = middle - 1;
      } else {
        lower = middle + 1;
      }
    }

    return result;
  }

  static long computeWeight(int bi, int bk, int bj) {
    return (long) (bi - bj) * (bj - bk);
  }
}
