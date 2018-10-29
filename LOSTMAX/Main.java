import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < T; tc++) {
			List<Integer> numbers = readNumbers(sc.nextLine());

			System.out.println(solve(numbers));
		}

		sc.close();
	}

	static List<Integer> readNumbers(String line) {
		List<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(line);
		while (sc.hasNextInt()) {
			numbers.add(sc.nextInt());
		}
		sc.close();
		return numbers;
	}

	static int solve(List<Integer> numbers) {
		numbers.remove(Integer.valueOf(numbers.size() - 1));

		return numbers.stream().mapToInt(x -> x).max().getAsInt();
	}
}
