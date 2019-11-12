import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final int LIMIT = 128;
	static int[] sequence = buildSequence();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int[] buildSequence() {
		int[] sequence = new int[LIMIT];
		Map<Integer, Integer> valueToLastIndex = new HashMap<>();
		for (int i = 1; i < sequence.length; i++) {
			int value;
			if (valueToLastIndex.containsKey(sequence[i - 1])) {
				value = i - 1 - valueToLastIndex.get(sequence[i - 1]);
			} else {
				value = 0;
			}

			sequence[i] = value;
			valueToLastIndex.put(sequence[i - 1], i - 1);
		}

		return sequence;
	}

	static int solve(int N) {
		return (int) IntStream.range(0, N).filter(i -> sequence[i] == sequence[N - 1]).count();
	}
}
