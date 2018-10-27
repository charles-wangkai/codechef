import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int year = sc.nextInt();

			System.out.println(solve(year));
		}

		sc.close();
	}

	static String solve(int year) {
		return LocalDate.of(year, 1, 1).format(DateTimeFormatter.ofPattern("EEEE")).toLowerCase();
	}
}
