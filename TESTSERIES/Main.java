import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int[] R = new int[5];
      for (int i = 0; i < R.length; ++i) {
        R[i] = sc.nextInt();
      }

      System.out.println(solve(R));
    }

    sc.close();
  }

  static String solve(int[] R) {
    int count1 = (int) Arrays.stream(R).filter(Ri -> Ri == 1).count();
    int count2 = (int) Arrays.stream(R).filter(Ri -> Ri == 2).count();

    if (count1 == count2) {
      return "DRAW";
    } else if (count1 > count2) {
      return "INDIA";
    }

    return "ENGLAND";
  }
}
