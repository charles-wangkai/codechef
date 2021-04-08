import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] budgets = new int[N];
    for (int i = 0; i < budgets.length; ++i) {
      budgets[i] = sc.nextInt();
    }

    System.out.println(solve(budgets));

    sc.close();
  }

  static long solve(int[] budgets) {
    int[] sorted =
        Arrays.stream(budgets).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();

    return IntStream.range(0, sorted.length).mapToLong(i -> (i + 1L) * sorted[i]).max().getAsLong();
  }
}
