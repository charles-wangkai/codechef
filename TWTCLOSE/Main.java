import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.nextLine();
		String[] clicks = new String[K];
		for (int i = 0; i < clicks.length; i++) {
			clicks[i] = sc.nextLine();
		}
		System.out.print(solve(N, clicks));

		sc.close();
	}

	static String solve(int N, String[] clicks) {
		boolean[] opens = new boolean[N + 1];
		int openNum = 0;
		int[] result = new int[clicks.length];
		for (int i = 0; i < result.length; i++) {
			if (clicks[i].equals("CLOSEALL")) {
				openNum = 0;
				Arrays.fill(opens, false);
			} else {
				int seq = Integer.parseInt(clicks[i].split(" ")[1]);

				if (opens[seq]) {
					openNum--;
				} else {
					openNum++;
				}

				opens[seq] = !opens[seq];
			}

			result[i] = openNum;
		}

		return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining("\n"));
	}
}
