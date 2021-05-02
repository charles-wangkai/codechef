import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      String[] S = new String[N];
      for (int i = 0; i < S.length; ++i) {
        S[i] = sc.next();
      }

      System.out.println(solve(S, A, B));
    }

    sc.close();
  }

  static String solve(String[] S, int A, int B) {
    long point1 = 0;
    long point2 = 0;
    for (String si : S) {
      if ("EQUINOX".indexOf(si.charAt(0)) >= 0) {
        point1 += A;
      } else {
        point2 += B;
      }
    }

    if (point1 < point2) {
      return "ANURADHA";
    } else if (point1 > point2) {
      return "SARTHAK";
    }

    return "DRAW";
  }
}
