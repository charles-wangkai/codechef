import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] Q = new int[n];
      for (int i = 0; i < Q.length; ++i) {
        Q[i] = sc.nextInt();
      }

      System.out.println(solve(Q, k));
    }

    sc.close();
  }

  static long solve(int[] Q, int k) {
    long remain = 0;
    for (int i = 0; i < Q.length; ++i) {
      remain += Q[i];
      if (remain < k) {
        return i + 1;
      }

      remain -= k;
    }

    return Q.length + remain / k + 1;
  }
}
