import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] finished = new int[m];
			for (int i = 0; i < finished.length; i++) {
				finished[i] = sc.nextInt();
			}

			System.out.println(solve(n, finished));
		}

		sc.close();
	}

	static String solve(int n, int[] finished) {
		List<Integer> chef = new ArrayList<Integer>();
		List<Integer> assistant = new ArrayList<Integer>();
		boolean chefTurn = true;
		Set<Integer> finishedSet = Arrays.stream(finished).boxed().collect(Collectors.toSet());
		for (int i = 1; i <= n; i++) {
			if (!finishedSet.contains(i)) {
				if (chefTurn) {
					chef.add(i);
				} else {
					assistant.add(i);
				}

				chefTurn = !chefTurn;
			}
		}

		return String.format("%s\n%s", output(chef), output(assistant));
	}

	static String output(List<Integer> indices) {
		return String.join(" ", indices.stream().map(String::valueOf).collect(Collectors.toList()));
	}
}
