import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(X, Y, A, B, K));
    }

    sc.close();
  }

  static String solve(int X, int Y, int A, int B, int K) {
    int petrolPrice = X + K * A;
    int dieselPrice = Y + K * B;

    if (petrolPrice < dieselPrice) {
      return "PETROL";
    } else if (petrolPrice > dieselPrice) {
      return "DIESEL";
    }

    return "SAME PRICE";
  }
}
