import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int G = sc.nextInt() - 1;
      int P = sc.nextInt();
      int[] X = new int[10];
      for (int i = 0; i < X.length; ++i) {
        X[i] = sc.nextInt();
      }

      System.out.println(solve(G, P, X));
    }

    sc.close();
  }

  static String solve(int G, int P, int[] X) {
    int min = IntStream.range(G + 1, X.length).map(i -> X[i]).sum() + 1;
    int max = IntStream.range(G, X.length).map(i -> X[i]).sum();

    return String.format("%d %d", (min + P - 1) / P, (max + P - 1) / P);
  }
}
