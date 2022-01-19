import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int[] scores1 = new int[3];
      for (int i = 0; i < scores1.length; ++i) {
        scores1[i] = sc.nextInt();
      }
      int[] scores2 = new int[3];
      for (int i = 0; i < scores2.length; ++i) {
        scores2[i] = sc.nextInt();
      }

      System.out.println(solve(scores1, scores2));
    }

    sc.close();
  }

  static String solve(int[] scores1, int[] scores2) {
    int sum1 = Arrays.stream(scores1).sum();
    int sum2 = Arrays.stream(scores2).sum();
    if (sum1 > sum2) {
      return "Dragon";
    } else if (sum1 < sum2) {
      return "Sloth";
    }

    for (int i = 0; i < scores1.length; ++i) {
      if (scores1[i] > scores2[i]) {
        return "Dragon";
      } else if (scores1[i] < scores2[i]) {
        return "Sloth";
      }
    }

    return "Tie";
  }
}