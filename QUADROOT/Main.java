import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		System.out.println(solve(A, B, C));

		sc.close();
	}

	static String solve(double A, double B, double C) {
		double x1 = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
		double x2 = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);

		return String.format("%f\n%f", x1, x2);
	}
}
