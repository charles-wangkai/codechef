import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		double Y = sc.nextDouble();

		System.out.printf("%.2f\n", solve(X, Y));

		sc.close();
	}

	static double solve(int X, double Y) {
		return (X % 5 == 0 && Y - X - 0.5 >= 0) ? (Y - X - 0.5) : Y;
	}
}
