import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int N = sc.nextInt();

      System.out.println(solve(N));
    }

    sc.close();
  }

  static String solve(int N) {
    char[][] chessboard = new char[N][N];
    for (int r = 0; r < N; ++r) {
      for (int c = 0; c < N; ++c) {
        chessboard[r][c] = (r == c && (r == 1 || r >= 3)) ? 'Q' : '.';
      }
    }

    return Arrays.stream(chessboard).map(String::new).collect(Collectors.joining("\n"));
  }
}
