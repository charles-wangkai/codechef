import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A1 = sc.nextInt();
      int A2 = sc.nextInt();
      int B1 = sc.nextInt();
      int B2 = sc.nextInt();
      int C1 = sc.nextInt();
      int C2 = sc.nextInt();

      System.out.println(solve(A1, A2, B1, B2, C1, C2));
    }

    sc.close();
  }

  static int solve(int A1, int A2, int B1, int B2, int C1, int C2) {
    return IntStream.of(A1 + A2, B1 + B2, C1 + C2).max().getAsInt();
  }
}
