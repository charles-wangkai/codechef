import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int D = sc.nextInt();
      int d = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(D, d, A, B, C));
    }

    sc.close();
  }

  static int solve(int D, int d, int A, int B, int C) {
    int distance = D * d;
    if (distance >= 42) {
      return C;
    } else if (distance >= 21) {
      return B;
    } else if (distance >= 10) {
      return A;
    }

    return 0;
  }
}
