import java.util.Scanner;

public class Main {
  static final String[] DIRECTIONS = {"North", "East", "South", "West"};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int X = sc.nextInt();

      System.out.println(solve(X));
    }

    sc.close();
  }

  static String solve(int X) {
    return DIRECTIONS[X % DIRECTIONS.length];
  }
}
