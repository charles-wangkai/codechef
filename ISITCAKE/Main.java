import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int[] times = new int[100];
			for (int i = 0; i < times.length; i++) {
				times[i] = sc.nextInt();
			}

			System.out.println(solve(times) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int[] times) {
		return Arrays.stream(times).filter(time -> time <= 30).count() >= 60;
	}
}
