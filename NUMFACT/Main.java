import java.util.Scanner;

public class Main {
  static final int LIMIT = 1_000_000;

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
    for (int Ai : A) {
      for (int i = 2; i * i <= Ai; ++i) {
        while (Ai % i == 0) {
          ++counts[i];
          Ai /= i;
        }
      }
      if (Ai != 1) {
        ++counts[Ai];
      }
    }

    int result = 1;
    for (int count : counts) {
      result *= count + 1;
    }

    return result;
  }
}
