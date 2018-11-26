import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final String TARGET = "spoon";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			char[][] M = new char[R][C];
			for (int r = 0; r < R; r++) {
				String line = sc.next();
				for (int c = 0; c < C; c++) {
					M[r][c] = line.charAt(c);
				}
			}

			System.out.println(solve(M) ? "There is a spoon!" : "There is indeed no spoon!");
		}

		sc.close();
	}

	static boolean solve(char[][] M) {
		return IntStream.range(0, M.length).anyMatch(r -> new String(M[r]).toLowerCase().contains(TARGET))
				|| IntStream.range(0, M[0].length)
						.anyMatch(c -> IntStream.range(0, M.length).mapToObj(r -> M[r][c])
								.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString()
								.toLowerCase().contains(TARGET));
	}
}
