import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] permutation = new int[N + 1];
		for (int i = 1; i < permutation.length; i++) {
			permutation[i] = sc.nextInt();
		}
		System.out.println(solve(permutation));

		sc.close();
	}

	static String solve(int[] permutation) {
		boolean[] visited = new boolean[permutation.length];
		List<List<Integer>> cycles = new ArrayList<>();
		for (int i = 1; i < visited.length; i++) {
			if (visited[i]) {
				continue;
			}

			List<Integer> cycle = new ArrayList<>();
			int pos = i;
			while (true) {
				visited[pos] = true;
				cycle.add(pos);

				if (cycle.size() > 1 && cycle.get(0) == pos) {
					break;
				}

				pos = permutation[pos];
			}
			cycles.add(cycle);
		}

		StringBuilder result = new StringBuilder();
		result.append(cycles.size()).append("\n");
		for (List<Integer> cycle : cycles) {
			result.append(String.join(" ", cycle.stream().map(String::valueOf).collect(Collectors.toList())))
					.append("\n");
		}
		return result.toString();
	}
}
