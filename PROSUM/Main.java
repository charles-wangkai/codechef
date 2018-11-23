import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			System.out.println(solve(A));
		}
	}

	static long solve(int[] A) {
		int gteThreeNum = (int) Arrays.stream(A).filter(x -> x >= 3).count();
		int twoNum = (int) Arrays.stream(A).filter(x -> x == 2).count();

		return (long) gteThreeNum * (gteThreeNum - 1) / 2 + (long) gteThreeNum * twoNum;
	}
}
