import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int R = sc.nextInt();

      System.out.println(solve(R));
    }

    sc.close();
  }

  static int solve(int R) {
    if (R >= 2000) {
      return 1;
    } else if (R >= 1600) {
      return 2;
    }

    return 3;
  }
}
