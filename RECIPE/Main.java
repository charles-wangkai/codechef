import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] ingredients = new int[N];
			for (int i = 0; i < ingredients.length; i++) {
				ingredients[i] = sc.nextInt();
			}

			System.out.println(String.join(" ",
					Arrays.stream(solve(ingredients)).mapToObj(String::valueOf).collect(Collectors.toList())));
		}

		sc.close();
	}

	static int[] solve(int[] ingredients) {
		int g = gcd(ingredients);

		return Arrays.stream(ingredients).map(ingredient -> ingredient / g).toArray();
	}

	static int gcd(int[] ingredients) {
		int g = ingredients[0];
		for (int i = 1; i < ingredients.length; i++) {
			g = gcd(g, ingredients[i]);
		}
		return g;
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
