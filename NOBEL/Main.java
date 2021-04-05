import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
      int[] A = new int[N];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < A.length; ++i) {
        A[i] = Integer.parseInt(st.nextToken());
      }

      System.out.println(solve(A, M) ? "Yes" : "No");
    }
  }

  static boolean solve(int[] A, int M) {
    return Arrays.stream(A).distinct().count() < M;
  }
}
