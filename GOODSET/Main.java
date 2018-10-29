import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	static final int N_LIMIT = 100;
	static final int VALUE_LIMIT = 500;

	static int[] goodSet = buildGoodSet();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();

			System.out.println(String.join(" ",
					IntStream.range(0, n).mapToObj(i -> String.valueOf(goodSet[i])).collect(Collectors.toList())));
		}

		sc.close();
	}

	static int[] buildGoodSet() {
		int[] result = new int[N_LIMIT];
		boolean[] sums = new boolean[VALUE_LIMIT + 1];

		int number = 1;
		for (int i = 0; i < result.length; i++) {
			while (sums[number]) {
				number++;
			}

			result[i] = number;
			number++;

			for (int j = 0; j < i; j++) {
				int sum = result[j] + result[i];
				if (sum < sums.length) {
					sums[sum] = true;
				}
			}
		}

		return result;
	}
}
