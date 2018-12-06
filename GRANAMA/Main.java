import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String R = sc.next();
			String S = sc.next();

			System.out.println(solve(R, S) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String R, String S) {
		Map<Character, Integer> ingredientToCountR = buildIngredientToCount(R);
		Map<Character, Integer> ingredientToCountS = buildIngredientToCount(S);

		return ingredientToCountR.equals(ingredientToCountS) == ingredientToCountR.keySet()
				.equals(ingredientToCountS.keySet());
	}

	static Map<Character, Integer> buildIngredientToCount(String recipe) {
		Map<Character, Integer> ingredientToCount = new HashMap<>();
		for (char ingredient : recipe.toCharArray()) {
			ingredientToCount.put(ingredient, ingredientToCount.getOrDefault(ingredient, 0) + 1);
		}
		return ingredientToCount;
	}
}
