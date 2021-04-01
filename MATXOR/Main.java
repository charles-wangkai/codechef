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
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());

      System.out.println(solve(N, M, K));
    }
  }

  static int solve(int N, int M, int K) {
    int result = 0;
    for (int i = 2; i <= N + M; ++i) {
      int minR = Math.max(1, i - M);
      int maxR = Math.min(N, i - 1);

      if ((maxR - minR + 1) % 2 != 0) {
        result ^= i + K;
      }
    }

    return result;
  }
}
