import java.util.Scanner;

public class Main {
  static final int SIZE = 2000;

  static int[][] matrix = new int[SIZE][SIZE];

  public static void main(String[] args) {
    fillMatrix();

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int x1 = sc.nextInt() - 1;
      int y1 = sc.nextInt() - 1;
      int x2 = sc.nextInt() - 1;
      int y2 = sc.nextInt() - 1;

      System.out.println(solve(x1, y1, x2, y2));
    }

    sc.close();
  }

  static void fillMatrix() {
    int r = 0;
    int c = 0;
    int nextC = 1;
    for (int i = 1; c != SIZE; ++i) {
      matrix[r][c] = i;

      ++r;
      --c;
      if (c == -1) {
        r = 0;
        c = nextC;
        ++nextC;
      }
    }
  }

  static long solve(int x1, int y1, int x2, int y2) {
    long result = 0;
    for (int r = x1; r < x2; ++r) {
      result += matrix[r][y1];
    }
    for (int c = y1; c <= y2; ++c) {
      result += matrix[x2][c];
    }

    return result;
  }
}
