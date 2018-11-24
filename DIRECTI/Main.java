import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			sc.nextLine();
			String[] instructions = new String[N];
			for (int i = 0; i < instructions.length; i++) {
				instructions[i] = sc.nextLine();
			}

			Arrays.stream(solve(instructions)).forEach(System.out::println);
			System.out.println();
		}

		sc.close();
	}

	static String[] solve(String[] instructions) {
		String[] result = new String[instructions.length];
		for (int i = 0; i < result.length; i++) {
			String command;
			if (i == 0) {
				command = "Begin";
			} else {
				command = instructions[result.length - i].split(" ")[0].equals("Left") ? "Right" : "Left";
			}

			String road = String.join(" ",
					Arrays.stream(instructions[result.length - 1 - i].split(" ")).skip(2).collect(Collectors.toList()));

			result[i] = command + " on " + road;
		}
		return result;
	}
}
