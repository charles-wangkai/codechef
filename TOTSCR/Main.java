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
      int[] A = new int[K];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < A.length; ++i) {
        A[i] = Integer.parseInt(st.nextToken());
      }
      for (int i = 0; i < N; ++i) {
        st = new StringTokenizer(br.readLine());
        String S = st.nextToken();

        out.append(solve(A, S)).append("\n");
      }
    }
    System.out.print(out);
  }

  static long solve(int[] A, String S) {
    long result = 0;
    for (int i = 0; i < A.length; ++i) {
      if (S.charAt(i) == '1') {
        result += A[i];
      }
    }

    return result;
  }
}
