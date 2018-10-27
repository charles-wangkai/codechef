import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		System.out.println(solve(N1, N2));

		sc.close();
	}

	static int solve(int N1, int N2) {
		return (N1 > N2) ? (N1 - N2) : (N1 + N2);
	}
}
