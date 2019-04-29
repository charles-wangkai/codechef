import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String date = sc.next();
			String[] fields = date.split(":");
			int year = Integer.parseInt(fields[0]);
			int month = Integer.parseInt(fields[1]);
			int dayOfMonth = Integer.parseInt(fields[2]);

			System.out.println(solve(year, month, dayOfMonth));
		}

		sc.close();
	}

	static int solve(int year, int month, int dayOfMonth) {
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		int result = 0;
		while (dayOfMonth % 2 == date.getDayOfMonth() % 2) {
			result++;

			date = date.plusDays(2);
		}
		return result;
	}
}
