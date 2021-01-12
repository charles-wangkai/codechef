import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      System.out.println(solve(N, K, x, y));
    }

    sc.close();
  }

  static String solve(int N, int K, int x, int y) {
    int resultX;
    int resultY;
    K %= 4;
    if (x < y) {
      if (K == 1) {
        resultX = x - y + N;
        resultY = N;
      } else if (K == 2) {
        resultX = N;
        resultY = x - y + N;
      } else if (K == 3) {
        resultX = y - x;
        resultY = 0;
      } else {
        resultX = 0;
        resultY = y - x;
      }
    } else if (x > y) {
      if (K == 1) {
        resultX = N;
        resultY = y - x + N;
      } else if (K == 2) {
        resultX = y - x + N;
        resultY = N;
      } else if (K == 3) {
        resultX = 0;
        resultY = x - y;
      } else {
        resultX = x - y;
        resultY = 0;
      }
    } else {
      resultX = N;
      resultY = N;
    }

    return String.format("%d %d", resultX, resultY);
  }
}
