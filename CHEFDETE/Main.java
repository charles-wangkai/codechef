import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] R = new int[N];
		for (int i = 0; i < R.length; i++) {
			R[i] = sc.nextInt();
		}
		System.out.println(String.join(" ", solve(R).stream().map(String::valueOf).collect(Collectors.toList())));

		sc.close();
	}

	static List<Integer> solve(int[] R) {
		Set<Integer> reported = Arrays.stream(R).boxed().collect(Collectors.toSet());
		return IntStream.rangeClosed(1, R.length).filter(x -> !reported.contains(x)).boxed()
				.collect(Collectors.toList());
	}
}
