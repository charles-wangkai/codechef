import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int G1 = sc.nextInt();
      int S1 = sc.nextInt();
      int B1 = sc.nextInt();
      int G2 = sc.nextInt();
      int S2 = sc.nextInt();
      int B2 = sc.nextInt();

      System.out.println(solve(G1, S1, B1, G2, S2, B2));
    }

    sc.close();
  }

  static int solve(int G1, int S1, int B1, int G2, int S2, int B2) {
    int total1 = G1 + S1 + B1;
    int total2 = G2 + S2 + B2;

    return (total1 > total2) ? 1 : 2;
  }
}
