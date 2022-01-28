import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int Z = sc.nextInt();

      System.out.println(solve(X, Y, Z));
    }

    sc.close();
  }

  static int solve(int X, int Y, int Z) {
    return X * (Z - Y);
  }
}