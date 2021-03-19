import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int C = sc.nextInt();

      System.out.println(solve(C));
    }

    sc.close();
  }

  static long solve(int C) {
    int A = (1 << (Integer.toBinaryString(C).length() - 1)) - 1;
    int B = C ^ A;

    return (long) A * B;
  }
}
