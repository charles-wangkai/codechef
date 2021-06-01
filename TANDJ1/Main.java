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
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());

      System.out.println(solve(a, b, c, d, K) ? "YES" : "NO");
    }
  }

  static boolean solve(int a, int b, int c, int d, int K) {
    int minMoveNum = Math.abs(a - c) + Math.abs(b - d);

    return K >= minMoveNum && minMoveNum % 2 == K % 2;
  }
}
