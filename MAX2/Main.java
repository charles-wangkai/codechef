import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.nextInt();
		String X = sc.next();
		System.out.println(solve(X));

		sc.close();
	}

	static int solve(String X) {
		int result = 0;
		for (int i = X.length() - 1; i >= 0 && X.charAt(i) == '0'; i--) {
			result++;
		}
		return result;
	}
}
