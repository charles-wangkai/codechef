import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] instructions = new int[n];
			for (int i = 0; i < instructions.length; i++) {
				instructions[i] = sc.nextInt();
			}

			System.out.println(solve(instructions) ? "Valid" : "Invalid");
		}

		sc.close();
	}

	static boolean solve(int[] instructions) {
		int depth = 0;
		for (int instruction : instructions) {
			if (instruction == 1) {
				depth++;
			} else {
				if (depth == 0) {
					return false;
				}

				depth--;
			}
		}
		return true;
	}
}
