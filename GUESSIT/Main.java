import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 1; tc <= T; ++tc) {
      solve(sc);
    }

    sc.close();
  }

  static void solve(Scanner sc) {
    for (int i = 1; ; ++i) {
      System.out.println(i * i);
      System.out.flush();

      int response = sc.nextInt();
      if (response == -1) {
        System.exit(1);
      }
      if (response == 1) {
        break;
      }
    }
  }
}
