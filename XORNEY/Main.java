import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder output = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			long L = Long.parseLong(st.nextToken());
			long R = Long.parseLong(st.nextToken());

			output.append(solve(L, R)).append("\n");
		}
		System.out.print(output);
	}

	static String solve(long L, long R) {
		long count = R - L + 1;

		int result = (int) (count / 2 % 2);
		if (count % 2 != 0) {
			result ^= L % 2;
		}

		return (result == 0) ? "Even" : "Odd";
	}
}
