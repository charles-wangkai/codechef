import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int M = sc.nextInt();
      int H = sc.nextInt();

      System.out.println(solve(M, H));
    }

    sc.close();
  }

  static int solve(int M, int H) {
    int BMI = M / (H * H);

    if (BMI <= 18) {
      return 1;
    } else if (BMI <= 24) {
      return 2;
    } else if (BMI <= 29) {
      return 3;
    } else {
      return 4;
    }
  }
}
