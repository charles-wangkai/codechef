import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String[] ingredients1 = readIngredients(sc);
			String[] ingredients2 = readIngredients(sc);

			System.out.println(solve(ingredients1, ingredients2) ? "similar" : "dissimilar");
		}

		sc.close();
	}

	static String[] readIngredients(Scanner sc) {
		String[] ingredients = new String[4];
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = sc.next();
		}
		return ingredients;
	}

	static boolean solve(String[] ingredients1, String[] ingredients2) {
		return Arrays.stream(ingredients1).filter(ingredient1 -> Arrays.asList(ingredients2).contains(ingredient1))
				.count() >= 2;
	}
}
