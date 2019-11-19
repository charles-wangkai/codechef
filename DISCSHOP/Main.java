import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			System.out.println(solve(N));
		}
	}

	static int solve(int N) {
		String s = String.valueOf(N);

		return IntStream.range(0, s.length())
				.map(i -> Integer.parseInt(String.format("%s%s", s.substring(0, i), s.substring(i + 1)))).min()
				.getAsInt();
	}
}
