import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x = sc.nextInt();

      System.out.println(solve(x));
    }

    sc.close();
  }

  static String solve(int x) {
    if (x < 100) {
      return "Easy";
    } else if (x < 200) {
      return "Medium";
    }

    return "Hard";
  }
}
