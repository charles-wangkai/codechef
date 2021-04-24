import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < A.length; ++i) {
        A[i] = sc.nextInt();
      }
      int[] B = new int[N];
      for (int i = 0; i < B.length; ++i) {
        B[i] = sc.nextInt();
      }

      System.out.println(solve(A, B));
    }

    sc.close();
  }

  static int solve(int[] A, int[] B) {
    int[] sortedA = Arrays.stream(A).boxed().sorted().mapToInt(x -> x).toArray();
    int[] sortedB =
        Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();

    return IntStream.range(0, sortedA.length).map(i -> sortedA[i] + sortedB[i]).max().getAsInt();
  }
}
