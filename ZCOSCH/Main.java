import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		System.out.println(solve(R));

		sc.close();
	}

	static int solve(int R) {
		if (R <= 50) {
			return 100;
		} else if (R <= 100) {
			return 50;
		} else {
			return 0;
		}
	}
}
