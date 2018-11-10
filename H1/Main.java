import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int SIZE = 3;
	static final String TARGET_STATE = "123456789";
	static final int[] R_OFFSET = { 0, 1 };
	static final int[] C_OFFSET = { 1, 0 };

	static Map<String, Integer> stateToStep = buildStateToStep();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int[][] board = new int[SIZE][SIZE];
			for (int r = 0; r < SIZE; r++) {
				for (int c = 0; c < SIZE; c++) {
					board[r][c] = sc.nextInt();
				}
			}

			System.out.println(solve(board));
		}

		sc.close();
	}

	static Map<String, Integer> buildStateToStep() {
		Map<String, Integer> stateToStep = new HashMap<>();
		stateToStep.put(TARGET_STATE, 0);
		Queue<String> queue = new LinkedList<>();
		queue.offer(TARGET_STATE);

		while (!queue.isEmpty()) {
			String state = queue.poll();
			int[][] board = decode(state);

			for (int r = 0; r < SIZE; r++) {
				for (int c = 0; c < SIZE; c++) {
					for (int i = 0; i < R_OFFSET.length; i++) {
						int nextR = r + R_OFFSET[i];
						int nextC = c + C_OFFSET[i];

						if (nextR < SIZE && nextC < SIZE && isPrime(board[r][c] + board[nextR][nextC])) {
							swap(board, r, c, nextR, nextC);

							String nextState = encode(board);
							if (!stateToStep.containsKey(nextState)) {
								stateToStep.put(nextState, stateToStep.get(state) + 1);
								queue.offer(nextState);
							}

							swap(board, r, c, nextR, nextC);
						}
					}
				}
			}
		}

		return stateToStep;
	}

	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void swap(int[][] board, int r1, int c1, int r2, int c2) {
		int temp = board[r1][c1];
		board[r1][c1] = board[r2][c2];
		board[r2][c2] = temp;
	}

	static String encode(int[][] board) {
		StringBuilder state = new StringBuilder();
		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				state.append(board[r][c]);
			}
		}
		return state.toString();
	}

	static int[][] decode(String state) {
		int[][] board = new int[SIZE][SIZE];
		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				board[r][c] = state.charAt(r * SIZE + c) - '0';
			}
		}
		return board;
	}

	static int solve(int[][] board) {
		return stateToStep.getOrDefault(encode(board), -1);
	}
}
