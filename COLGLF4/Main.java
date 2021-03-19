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
      int E = Integer.parseInt(st.nextToken());
      int H = Integer.parseInt(st.nextToken());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      System.out.println(solve(N, E, H, A, B, C));
    }
  }

  static long solve(int N, int E, int H, int A, int B, int C) {
    long result = Long.MAX_VALUE;
    for (int cNum = 0; cNum <= Math.min(N, Math.min(E, H)); ++cNum) {
      int aMaxNum = (E - cNum) / 2;
      int bMaxNum = (H - cNum) / 3;

      if (aMaxNum + bMaxNum + cNum >= N) {
        int aNum;
        int bNum;
        if (A <= B) {
          aNum = Math.min(aMaxNum, N - cNum);
          bNum = N - cNum - aNum;
        } else {
          bNum = Math.min(bMaxNum, N - cNum);
          aNum = N - cNum - bNum;
        }

        result = Math.min(result, (long) aNum * A + (long) bNum * B + (long) cNum * C);
      }
    }

    return (result == Long.MAX_VALUE) ? -1 : result;
  }
}
