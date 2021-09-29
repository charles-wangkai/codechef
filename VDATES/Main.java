import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int D = sc.nextInt();
      int L = sc.nextInt();
      int R = sc.nextInt();

      System.out.println(solve(D, L, R));
    }

    sc.close();
  }

  static String solve(int D, int L, int R) {
    if (D < L) {
      return "Too Early";
    } else if (D > R) {
      return "Too Late";
    }

    return "Take second dose now";
  }
}
