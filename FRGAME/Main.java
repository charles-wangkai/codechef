import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();

      System.out.println(solve(A, B, C, D));
    }

    sc.close();
  }

  static String solve(int A, int B, int C, int D) {
    int coin1 = A;
    int coin2 = B;
    if (coin1 >= coin2) {
      coin2 += C;
    } else {
      coin1 += C;
    }
    if (coin1 >= coin2) {
      coin2 += D;
    } else {
      coin1 += D;
    }

    return (coin1 >= coin2) ? "N" : "S";
  }
}
