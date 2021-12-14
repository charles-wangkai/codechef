import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int P = sc.nextInt();
      int Q = sc.nextInt();

      System.out.println(solve(X, Y, P, Q));
    }

    sc.close();
  }

  static String solve(int X, int Y, int P, int Q) {
    int cmp = Integer.compare(X + P * 10, Y + Q * 10);

    if (cmp < 0) {
      return "Chef";
    } else if (cmp > 0) {
      return "Chefina";
    }

    return "Draw";
  }
}
