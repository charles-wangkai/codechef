import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int[] numbers = new int[N];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}

			System.out.println(solve(numbers, D));
		}

		sc.close();
	}

	static long solve(int[] numbers, int D) {
		Arrays.sort(numbers);

		long result = 0;
		int index = numbers.length - 1;
		while (index >= 1) {
			if (numbers[index] - numbers[index - 1] < D) {
				result += numbers[index] + numbers[index - 1];

				index -= 2;
			} else {
				index--;
			}
		}
		return result;
	}
}
