import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      sc.nextInt();
      String B = sc.next();

      System.out.println(solve(B) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(String B) {
    return B.chars().filter(ch -> ch == '0').count() <= 30;
  }
}
