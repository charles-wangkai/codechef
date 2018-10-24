import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.printf("%d %d\n", Math.max(A, B), A + B);
		}

		sc.close();
	}
}
