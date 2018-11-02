import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int[] activities = new int[30];
			for (int i = 0; i < activities.length; i++) {
				activities[i] = sc.nextInt();
			}

			System.out.println(solve(activities) ? "#coderlifematters" : "#allcodersarefun");
		}

		sc.close();
	}

	static boolean solve(int[] activities) {
		return IntStream.range(0, activities.length - 5)
				.anyMatch(i -> IntStream.rangeClosed(0, 5).allMatch(offset -> activities[i + offset] == 1));
	}
}
