import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int k = sc.nextInt();
			String message = sc.next();

			System.out.println(solve(k, message));
		}

		sc.close();
	}

	static String solve(int k, String message) {
		return IntStream.range(0, message.length())
				.mapToObj(i -> message.charAt(Integer.parseInt(
						new StringBuilder(String.format("%" + k + "s", Integer.toBinaryString(i)).replace(' ', '0'))
								.reverse().toString(),
						2)))
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
	}
}
