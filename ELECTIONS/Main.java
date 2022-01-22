import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int XA = sc.nextInt();
      int XB = sc.nextInt();
      int XC = sc.nextInt();

      System.out.println(solve(XA, XB, XC));
    }

    sc.close();
  }

  static String solve(int XA, int XB, int XC) {
    if (XA >= 51) {
      return "A";
    } else if (XB >= 51) {
      return "B";
    } else if (XC >= 51) {
      return "C";
    }

    return "NOTA";
  }
}