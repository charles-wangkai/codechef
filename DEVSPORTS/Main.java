import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int Z = sc.nextInt();
      int Y = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      System.out.println(solve(Z, Y, A, B, C) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int Z, int Y, int A, int B, int C) {
    return Y + A + B + C <= Z;
  }
}