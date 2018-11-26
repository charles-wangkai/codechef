import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int d = sc.nextInt();

			System.out.println(solve(d));
		}

		sc.close();
	}

	static int solve(int d) {
		StringBuilder sb = new StringBuilder();
		while (d != 0) {
			int digit = Math.min(d, 9);
			sb.append(digit);
			d -= digit;
		}

		return new BigInteger(sb.reverse().toString()).add(BigInteger.ONE).toString().chars().map(ch -> ch - '0').sum();
	}
}
