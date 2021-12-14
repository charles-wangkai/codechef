import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Throwable {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());
    for (int tc = 0; tc < T; ++tc) {
      st = new StringTokenizer(br.readLine());
      int xk = Integer.parseInt(st.nextToken());
      int yk = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      System.out.println(solve(xk, yk, x1, y1, x2, y2) ? "YES" : "NO");
    }
  }

  static boolean solve(int xk, int yk, int x1, int y1, int x2, int y2) {
    return ((y1 != y2 || (xk - x2) * (x1 - x2) > 0) && isCheckMate(xk, yk, xk, y1, x2, y2))
        || ((x1 != x2 || (yk - y2) * (y1 - y2) > 0) && isCheckMate(xk, yk, x1, yk, x2, y2))
        || ((y1 != y2 || (xk - x1) * (x2 - x1) > 0) && isCheckMate(xk, yk, x1, y1, xk, y2))
        || ((x1 != x2 || (yk - y1) * (y2 - y1) > 0) && isCheckMate(xk, yk, x1, y1, x2, yk));
  }

  static boolean isCheckMate(int xk, int yk, int x1, int y1, int x2, int y2) {
    for (int dx = -1; dx <= 1; ++dx) {
      for (int dy = -1; dy <= 1; ++dy) {
        int nextX = xk + dx;
        int nextY = yk + dy;
        if (nextX >= 1
            && nextX <= 8
            && nextY >= 1
            && nextY <= 8
            && !isAttacked(xk + dx, yk + dy, x1, y1)
            && !isAttacked(xk + dx, yk + dy, x2, y2)) {
          return false;
        }
      }
    }

    return true;
  }

  static boolean isAttacked(int xk, int yk, int x, int y) {
    return (xk != x || yk != y) && (xk == x || yk == y);
  }
}
