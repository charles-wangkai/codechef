import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A1 = sc.nextInt();
      int A2 = sc.nextInt();
      int A3 = sc.nextInt();
      int B1 = sc.nextInt();
      int B2 = sc.nextInt();
      int B3 = sc.nextInt();

      System.out.println(solve(A1, A2, A3, B1, B2, B3) ? "Pass" : "Fail");
    }

    sc.close();
  }

  static boolean solve(int A1, int A2, int A3, int B1, int B2, int B3) {
    return A1 + A2 + A3 == B1 + B2 + B3;
  }
}
