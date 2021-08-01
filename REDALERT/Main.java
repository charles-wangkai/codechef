import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int D = sc.nextInt();
      int H = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }

      System.out.println(solve(A, D, H) ? "YES" : "NO");
    }

    sc.close();
  }

  static boolean solve(int[] A, int D, int H) {
    int level = 0;
    for (int Ai : A) {
      if (Ai == 0) {
        level = Math.max(0, level - D);
      } else {
        level += Ai;

        if (level > H) {
          return true;
        }
      }
    }

    return false;
  }
}
