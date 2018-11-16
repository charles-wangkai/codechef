import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		System.out.println(solve(a) ? "yes" : "no");

		sc.close();
	}

	static boolean solve(long a) {
		return Arrays.asList(0, 1, 3).contains((int) (a % 6));
	}
}
