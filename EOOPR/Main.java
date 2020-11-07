import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();
      int Y = sc.nextInt();

      System.out.println(solve(X, Y));
    }

    sc.close();
  }

  static int solve(int X, int Y) {
    if (X < Y) {
      if ((Y - X) % 2 == 0) {
        if ((Y - X) % 4 == 0) {
          return 3;
        } else {
          return 2;
        }
      } else {
        return 1;
      }
    } else if (X > Y) {
      if ((X - Y) % 2 == 0) {
        return 1;
      } else {
        return 2;
      }
    } else {
      return 0;
    }
  }
}
