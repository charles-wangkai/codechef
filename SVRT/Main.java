import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Throwable {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder out = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());
    for (int tc = 0; tc < T; ++tc) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());

      out.append(solve(N, K)).append("\n");
    }
    System.out.print(out);
  }

  static String solve(int N, int K) {
    int D = (N - 1) / K + 1;

    int X = N % K;
    if (X == 0) {
      X = K;
    }

    return String.format("%d %d", D, X);
  }
}
