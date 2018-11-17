import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(solve(A));

		sc.close();
	}

	static int solve(int[] A) {
		List<Integer> zeroIndices = IntStream.range(0, A.length).filter(i -> A[i] == 0).boxed()
				.collect(Collectors.toList());
		zeroIndices.add(0, -1);
		zeroIndices.add(A.length);

		return IntStream.range(0, zeroIndices.size() - 1).map(i -> zeroIndices.get(i + 1) - zeroIndices.get(i) - 1)
				.max().getAsInt();
	}
}
