import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = solveX();
		output(X);

		int Y = sc.nextInt();

		int Z = solveZ(X, Y);
		output(Z);

		sc.close();
	}

	static void output(Object obj) {
		System.out.println(obj);
		System.out.flush();
	}

	static int solveX() {
		return new Random().nextInt(3) + 1;
	}

	static int solveZ(int X, int Y) {
		for (int i = 1;; i++) {
			if (i != X && i != Y) {
				return i;
			}
		}
	}
}
