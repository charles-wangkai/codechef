import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  static final int MODULUS = 1_000_000_007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < A.length; ++i) {
      A[i] = sc.nextInt();
    }
    int Q = sc.nextInt();
    int[] x = new int[Q];
    for (int i = 0; i < x.length; ++i) {
      x[i] = sc.nextInt();
    }

    System.out.println(solve(A, x));

    sc.close();
  }

  static String solve(int[] A, int[] x) {
    int[] result = new int[x.length];
    result[0] = multiplyMod(Arrays.stream(A).reduce(Main::addMod).getAsInt(), 2);
    for (int i = 1; i < result.length; ++i) {
      result[i] = multiplyMod(result[i - 1], 2);
    }

    return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining("\n"));
  }

  static int mod(long x) {
    return (int) ((x % MODULUS + MODULUS) % MODULUS);
  }

  static int addMod(int x, int y) {
    return mod(x + y);
  }

  static int multiplyMod(int x, int y) {
    return mod((long) x * y);
  }
}
