import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int A1 = sc.nextInt();
      int B1 = sc.nextInt();
      int A2 = sc.nextInt();
      int B2 = sc.nextInt();

      System.out.println(solve(A, B, A1, B1, A2, B2));
    }

    sc.close();
  }

  static int solve(int A, int B, int A1, int B1, int A2, int B2) {
    if ((A1 == A && B1 == B) || (A1 == B && B1 == A)) {
      return 1;
    } else if ((A2 == A && B2 == B) || (A2 == B && B2 == A)) {
      return 2;
    }

    return 0;
  }
}
