import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int R1 = sc.nextInt();
      int W1 = sc.nextInt();
      int C1 = sc.nextInt();
      int R2 = sc.nextInt();
      int W2 = sc.nextInt();
      int C2 = sc.nextInt();

      System.out.println(solve(R1, W1, C1, R2, W2, C2));
    }

    sc.close();
  }

  static String solve(int R1, int W1, int C1, int R2, int W2, int C2) {
    int better1 = 0;
    int better2 = 0;
    if (R1 > R2) {
      ++better1;
    } else {
      ++better2;
    }
    if (W1 > W2) {
      ++better1;
    } else {
      ++better2;
    }
    if (C1 > C2) {
      ++better1;
    } else {
      ++better2;
    }

    return (better1 > better2) ? "A" : "B";
  }
}
