import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int Q = sc.nextInt();
    for (int tc = 0; tc < Q; ++tc) {
      sc.nextInt();
      String S = sc.next();
      String T = sc.next();

      System.out.println(solve(S, T));
    }

    sc.close();
  }

  static int solve(String S, String T) {
    int bothCount = 0;
    int onlySCount = 0;
    int onlyTCount = 0;
    int noneCount = 0;
    for (int i = 0; i < S.length(); ++i) {
      if (S.charAt(i) == '1') {
        if (T.charAt(i) == '1') {
          ++bothCount;
        } else {
          ++onlySCount;
        }
      } else {
        if (T.charAt(i) == '1') {
          ++onlyTCount;
        } else {
          ++noneCount;
        }
      }
    }

    int pairCount = Math.min(onlySCount, onlyTCount);
    int restCount = onlySCount + onlyTCount + noneCount - pairCount * 2;

    return pairCount
        + ((restCount >= bothCount) ? bothCount : (restCount + (bothCount - restCount) / 2));
  }
}
