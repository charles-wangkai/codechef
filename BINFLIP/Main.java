import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int K = sc.nextInt();

      System.out.println(solve(N, K));
    }

    sc.close();
  }

  static String solve(int N, int K) {
    if (K == 0) {
      return "YES\n0";
    }
    if (K % 2 == 0) {
      return "NO";
    }

    List<Integer> startIndices = new ArrayList<>();
    for (int i = 0; K != 0; ++i) {
      int length = 1 << i;
      if (K == length || (K & (1 << (i + 1))) != 0) {
        startIndices.add(K + 1 - length);
      } else {
        int count = 0;
        while ((K & (1 << (i + count + 1))) == 0) {
          ++count;
        }

        int pos = K + 1 - length;
        for (int j = 0; j < count; ++j) {
          pos -= 1 << (i + j);
          startIndices.add(pos);
        }
        startIndices.add(pos);

        i += count;
      }

      K -= length;
    }

    StringBuilder result = new StringBuilder("YES\n");
    result.append(startIndices.size());
    for (int startIndex : startIndices) {
      result.append("\n").append(startIndex);
    }

    return result.toString();
  }
}
