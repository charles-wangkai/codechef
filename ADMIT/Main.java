import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
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
      int M = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int[] R = new int[N];
      for (int i = 0; i < R.length; ++i) {
        R[i] = Integer.parseInt(st.nextToken());
      }
      st = new StringTokenizer(br.readLine());
      int[] S = new int[M];
      for (int i = 0; i < S.length; ++i) {
        S[i] = Integer.parseInt(st.nextToken());
      }
      int[][] applied = new int[M][];
      for (int i = 0; i < applied.length; ++i) {
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        applied[i] = new int[K];
        for (int j = 0; j < applied[i].length; ++j) {
          applied[i][j] = Integer.parseInt(st.nextToken()) - 1;
        }
      }

      out.append(solve(R, S, applied)).append("\n");
    }
    System.out.print(out);
  }

  static int solve(int[] R, int[] S, int[][] applied) {
    Integer[] sortedIndices = new Integer[S.length];
    for (int i = 0; i < sortedIndices.length; ++i) {
      sortedIndices[i] = i;
    }
    Arrays.sort(sortedIndices, Comparator.comparing(i -> S[i]));

    boolean[] used = new boolean[R.length];
    for (int i = 0; ; ++i) {
      int collegeIndex = -1;
      for (int j : applied[sortedIndices[i]]) {
        if (!used[j] && (collegeIndex == -1 || R[j] < R[collegeIndex])) {
          collegeIndex = j;
        }
      }

      if (collegeIndex != -1) {
        used[collegeIndex] = true;
      }

      if (sortedIndices[i] == 0) {
        return collegeIndex + 1;
      }
    }
  }
}
