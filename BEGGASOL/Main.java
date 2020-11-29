import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int[] f = new int[N];
      for (int i = 0; i < f.length; ++i) {
        f[i] = sc.nextInt();
      }

      System.out.println(solve(f));
    }

    sc.close();
  }

  static int solve(int[] f) {
    int gasoline = 0;
    for (int i = 0; i < f.length; ++i) {
      gasoline += f[i];
      if (gasoline == 0) {
        return i;
      }

      --gasoline;
    }

    return f.length + gasoline;
  }
}
