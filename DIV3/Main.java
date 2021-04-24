import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int tc = 0; tc < t; ++tc) {
      int s0 = sc.nextInt();
      int s1 = sc.nextInt();
      int s2 = sc.nextInt();

      System.out.println(solve(s0, s1, s2));
    }

    sc.close();
  }

  static long solve(int s0, int s1, int s2) {
    return s0 + Math.min(s1, s2) + Math.abs(s1 - s2) / 3L;
  }
}
