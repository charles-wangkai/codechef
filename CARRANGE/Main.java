import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int P = sc.nextInt();
      int M = sc.nextInt();
      int V = sc.nextInt();

      System.out.println(solve(P, M, V));
    }

    sc.close();
  }

  static int solve(int P, int M, int V) {
    return (M - P + 1) * V;
  }
}