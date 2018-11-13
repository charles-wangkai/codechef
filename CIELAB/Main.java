import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(solve(A, B));

		sc.close();
	}

	static int solve(int A, int B) {
		int diff = A - B;
		return Math.max(1, diff / 10 * 10 + (diff % 10 + 1) % 10);
	}
}
