import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int SA = sc.nextInt();
      int SB = sc.nextInt();
      int SC = sc.nextInt();

      System.out.println(solve(SA, SB, SC));
    }

    sc.close();
  }

  static String solve(int SA, int SB, int SC) {
    if (SC < SA && SC < SB) {
      return "Alice";
    } else if (SB < SA && SB < SC) {
      return "Bob";
    }

    return "Draw";
  }
}
