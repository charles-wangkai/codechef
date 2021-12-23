import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] H = new int[N];
      for (int i = 0; i < H.length; ++i) {
        H[i] = sc.nextInt();
      }

      System.out.println(solve(H, K));
    }

    sc.close();
  }

  static int solve(int[] H, int K) {
    return (int) Arrays.stream(H).filter(h -> h > K).count();
  }
}
