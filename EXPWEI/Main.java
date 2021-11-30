import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  static final int MODULUS = 998_244_353;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();

      System.out.println(solve(N));
    }

    sc.close();
  }

  static int solve(int N) {
    return multiplyMod(
        multiplyMod(N + 1, invMod(2)), multiplyMod(multiplyMod(N, N + 1), invMod(2)));
  }

  static int multiplyMod(int x, int y) {
    return (int) ((long) x * y % MODULUS);
  }

  static int invMod(int x) {
    return BigInteger.valueOf(x).modInverse(BigInteger.valueOf(MODULUS)).intValue();
  }
}
