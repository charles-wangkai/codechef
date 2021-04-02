import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int R = sc.nextInt();
    int O = sc.nextInt();
    int C = sc.nextInt();
    System.out.println(solve(R, O, C) ? "YES" : "NO");

    sc.close();
  }

  static boolean solve(int R, int O, int C) {
    return C + (20 - O) * 36 > R;
  }
}
