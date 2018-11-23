import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		Operation[] operations = new Operation[Q];
		for (int i = 0; i < operations.length; i++) {
			String command = sc.next();
			int sequence = sc.nextInt();
			int x = sc.nextInt();

			operations[i] = new Operation(command, sequence, x);
		}
		System.out.println(solve(N, operations));

		sc.close();
	}

	static int solve(int N, Operation[] operations) {
		int[] rowAdds = new int[N + 1];
		int[] colAdds = new int[N + 1];
		for (Operation operation : operations) {
			if (operation.command.equals("RowAdd")) {
				rowAdds[operation.sequence] += operation.x;
			} else if (operation.command.equals("ColAdd")) {
				colAdds[operation.sequence] += operation.x;
			}
		}

		return Arrays.stream(rowAdds).max().getAsInt() + Arrays.stream(colAdds).max().getAsInt();
	}
}

class Operation {
	String command;
	int sequence;
	int x;

	Operation(String command, int sequence, int x) {
		this.command = command;
		this.sequence = sequence;
		this.x = x;
	}
}