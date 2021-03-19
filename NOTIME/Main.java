import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int[] T = new int[N];
    for (int i = 0; i < T.length; ++i) {
      T[i] = sc.nextInt();
    }

    System.out.println(solve(T, H, x) ? "YES" : "NO");

    sc.close();
  }

  static boolean solve(int[] T, int H, int x) {
    return Arrays.stream(T).max().getAsInt() + x >= H;
  }
}
