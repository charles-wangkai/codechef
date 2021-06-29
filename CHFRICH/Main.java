import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int X = sc.nextInt();

      System.out.println(solve(A, B, X));
    }

    sc.close();
  }

  static int solve(int A, int B, int X) {
    return (B - A) / X;
  }
}
