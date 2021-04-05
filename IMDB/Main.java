import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int[] S = new int[N];
      int[] R = new int[N];
      for (int i = 0; i < N; ++i) {
        S[i] = sc.nextInt();
        R[i] = sc.nextInt();
      }

      System.out.println(solve(S, R, X));
    }

    sc.close();
  }

  static int solve(int[] S, int[] R, int X) {
    return IntStream.range(0, S.length).filter(i -> S[i] <= X).map(i -> R[i]).max().getAsInt();
  }
}
