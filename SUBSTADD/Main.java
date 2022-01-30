import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }
      int[] B = new int[N];
      for (int i = 0; i < B.length; ++i) {
        B[i] = sc.nextInt();
      }

      System.out.println(solve(A, B, X, Y) ? "Yes" : "No");
    }

    sc.close();
  }

  static boolean solve(int[] A, int[] B, int X, int Y) {
    return IntStream.range(0, A.length).allMatch(i -> B[i] - A[i] == X || B[i] - A[i] == Y);
  }
}