import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		String C = sc.next();
		System.out.println(solve(A, B, C));

		sc.close();
	}

	static double solve(double A, double B, String C) {
		if (C.equals("+")) {
			return A + B;
		} else if (C.equals("-")) {
			return A - B;
		} else if (C.equals("*")) {
			return A * B;
		} else {
			return A / B;
		}
	}
}
