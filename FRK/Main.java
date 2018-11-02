import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nicknames = new String[N];
		for (int i = 0; i < nicknames.length; i++) {
			nicknames[i] = sc.next();
		}
		System.out.println(solve(nicknames));

		sc.close();
	}

	static int solve(String[] nicknames) {
		return (int) Arrays.stream(nicknames)
				.filter(nickname -> nickname.contains("ch") || nickname.contains("he") || nickname.contains("ef"))
				.count();
	}
}
