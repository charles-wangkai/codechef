import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();

      System.out.println(solve(A, B, C, D));
    }

    sc.close();
  }

  static int solve(int A, int B, int C, int D) {
    if (A + B + C <= D) {
      return 1;
    } else if (A + B <= D || B + C <= D || C + A <= D) {
      return 2;
    }

    return 3;
  }
}
