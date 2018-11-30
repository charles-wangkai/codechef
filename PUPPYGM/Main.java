import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(solve(A, B));
		}

		sc.close();
	}

	static String solve(int A, int B) {
		return (A % 2 == 0 || B % 2 == 0) ? "Tuzik" : "Vanka";
	}
}
