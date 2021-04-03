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
      int U = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
      int A = Integer.parseInt(st.nextToken());
      int S = Integer.parseInt(st.nextToken());

      System.out.println(solve(U, V, A, S) ? "Yes" : "No");
    }
  }

  static boolean solve(int U, int V, int A, int S) {
    return U * U - 2 * A * S <= V * V;
  }
}
