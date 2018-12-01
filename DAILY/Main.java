import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();
		String[] cars = new String[N];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = sc.next();
		}
		System.out.println(solve(X, cars));

		sc.close();
	}

	static int solve(int X, String[] cars) {
		int result = 0;
		for (String car : cars) {
			for (int i = 0; i < 9; i++) {
				int freeNum = (int) IntStream.of(i * 4, i * 4 + 1, i * 4 + 2, i * 4 + 3, 53 - i * 2, 52 - i * 2)
						.filter(j -> car.charAt(j) == '0').count();

				if (freeNum >= X) {
					result += C(freeNum, X);
				}
			}
		}
		return result;
	}

	static int C(int n, int m) {
		int result = 1;
		for (int i = 0; i < m; i++) {
			result = result * (n - i) / (i + 1);
		}
		return result;
	}
}
