import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(solve(a, b));
    }

    sc.close();
  }

  static int solve(int a, int b) {
    if (a + b < 3) {
      return 1;
    } else if (a + b <= 10) {
      return 2;
    } else if (a + b <= 60) {
      return 3;
    }

    return 4;
  }
}
