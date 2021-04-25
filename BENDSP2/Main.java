import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] H = new int[N];
    for (int i = 0; i < H.length; ++i) {
      H[i] = sc.nextInt();
    }
    int Q = sc.nextInt();
    sc.nextLine();
    String[] tasks = new String[Q];
    for (int i = 0; i < tasks.length; ++i) {
      tasks[i] = sc.nextLine();
    }

    System.out.println(solve(H, tasks));

    sc.close();
  }

  static String solve(int[] H, String[] tasks) {
    long oddSum =
        IntStream.range(0, H.length).filter(i -> i % 2 == 0).map(i -> H[i]).asLongStream().sum();
    long evenSum =
        IntStream.range(0, H.length).filter(i -> i % 2 != 0).map(i -> H[i]).asLongStream().sum();

    List<Long> result = new ArrayList<>();
    for (String task : tasks) {
      if (task.charAt(0) == '1') {
        String[] parts = task.split(" ");
        int L = Integer.parseInt(parts[1]);
        int R = Integer.parseInt(parts[2]);
        int X = Integer.parseInt(parts[3]);

        int minOdd = L + ((L % 2 == 0) ? 1 : 0);
        int maxOdd = R - ((R % 2 == 0) ? 1 : 0);
        oddSum += (maxOdd / 2L - minOdd / 2 + 1) * X;

        int minEven = L + ((L % 2 == 0) ? 0 : 1);
        int maxEven = R - ((R % 2 == 0) ? 0 : 1);
        evenSum += (maxEven / 2L - minEven / 2 + 1) * X;
      } else if (task.charAt(0) == '2') {
        result.add(oddSum);
      } else {
        result.add(evenSum);
      }
    }

    return result.stream().map(String::valueOf).collect(Collectors.joining("\n"));
  }
}
