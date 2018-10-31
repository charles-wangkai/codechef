import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] chapters = new int[n];
			for (int i = 0; i < chapters.length; i++) {
				chapters[i] = sc.nextInt();
			}

			System.out.println(solve(chapters) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int[] chapters) {
		return Arrays.stream(chapters).min().getAsInt() == 1
				&& Arrays.stream(chapters).max().getAsInt() == chapters.length
				&& Arrays.stream(chapters).boxed().collect(Collectors.toSet()).size() == chapters.length
				&& IntStream.range(0, chapters.length).anyMatch(i -> chapters[i] != i + 1);
	}
}
