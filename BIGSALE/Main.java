import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			Recipe[] recipes = new Recipe[N];
			for (int i = 0; i < recipes.length; i++) {
				int price = sc.nextInt();
				int quantity = sc.nextInt();
				int discount = sc.nextInt();

				recipes[i] = new Recipe(price, quantity, discount);
			}

			System.out.println(solve(recipes));
		}

		sc.close();
	}

	static double solve(Recipe[] recipes) {
		return Arrays.stream(recipes).mapToDouble(
				recipe -> (recipe.discount / 100.0) * (recipe.discount / 100.0) * recipe.price * recipe.quantity).sum();
	}
}

class Recipe {
	int price;
	int quantity;
	int discount;

	Recipe(int price, int quantity, int discount) {
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
}