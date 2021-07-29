import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(A, B, C));
    }

    sc.close();
  }

  static int solve(int A, int B, int C) {
    int[] sorted = IntStream.of(A, B, C).sorted().toArray();

    return (sorted[0] != sorted[2]) ? 1 : 0;
  }
}
