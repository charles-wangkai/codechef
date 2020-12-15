import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int D = sc.nextInt();
      int[] a = new int[N];
      for (int i = 0; i < a.length; ++i) {
        a[i] = sc.nextInt();
      }

      System.out.println(solve(a, D));
    }

    sc.close();
  }

  static int solve(int[] a, int D) {
    int riskNum = (int) Arrays.stream(a).filter(x -> x >= 80 || x <= 9).count();
    int nonRiskNum = a.length - riskNum;

    return (riskNum + D - 1) / D + (nonRiskNum + D - 1) / D;
  }
}
