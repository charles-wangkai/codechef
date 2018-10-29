import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		System.out.println(solve(N));

		sc.close();
	}

	static int solve(int N) {
		return (N % 4 == 0) ? (N + 1) : (N - 1);
	}
}
