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
      int w1 = Integer.parseInt(st.nextToken());
      int w2 = Integer.parseInt(st.nextToken());
      int x1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      System.out.println(solve(w1, w2, x1, x2, M) ? 1 : 0);
    }
  }

  static boolean solve(int w1, int w2, int x1, int x2, int M) {
    return x1 * M <= w2 - w1 && x2 * M >= w2 - w1;
  }
}
