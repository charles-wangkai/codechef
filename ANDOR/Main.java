import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      long x = sc.nextLong();

      System.out.println(solve(x));
    }

    sc.close();
  }

  static String solve(long x) {
    return String.format("0 %d", x);
  }
}
