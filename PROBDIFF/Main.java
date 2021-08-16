import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A1 = sc.nextInt();
      int A2 = sc.nextInt();
      int A3 = sc.nextInt();
      int A4 = sc.nextInt();

      System.out.println(solve(A1, A2, A3, A4));
    }

    sc.close();
  }

  static int solve(int A1, int A2, int A3, int A4) {
    if (A1 == A2 && A2 == A3 && A3 == A4) {
      return 0;
    }
    if ((A1 != A2 && A3 != A4) || (A1 != A3 && A2 != A4) || (A1 != A4 && A2 != A3)) {
      return 2;
    }

    return 1;
  }
}
