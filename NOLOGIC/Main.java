import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < T; tc++) {
			String question = sc.nextLine();

			System.out.println(solve(question));
		}

		sc.close();
	}

	static String solve(String question) {
		int[] letters = IntStream.rangeClosed('a', 'z').filter(ch -> question.toLowerCase().indexOf(ch) < 0).toArray();
		return (letters.length == 0) ? "~" : String.valueOf((char) letters[0]);
	}
}
