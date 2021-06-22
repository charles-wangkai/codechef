import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int Q = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < a.length; ++i) {
      a[i] = sc.nextInt();
    }
    int[] x = new int[Q];
    for (int i = 0; i < x.length; ++i) {
      x[i] = sc.nextInt();
    }

    System.out.println(solve(a, x));

    sc.close();
  }

  static String solve(int[] a, int[] x) {
    int[] sorted = Arrays.stream(a).boxed().sorted().mapToInt(ai -> ai).toArray();

    return Arrays.stream(x)
        .mapToObj(
            xi -> {
              int index = Arrays.binarySearch(sorted, xi);
              if (index >= 0) {
                return "0";
              }
              index = -1 - index;

              return ((sorted.length - index) % 2 == 0) ? "POSITIVE" : "NEGATIVE";
            })
        .collect(Collectors.joining("\n"));
  }
}
