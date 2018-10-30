import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			char[][] A = new char[N][M];
			for (int i = 0; i < N; i++) {
				String line = sc.next();
				for (int j = 0; j < M; j++) {
					A[i][j] = line.charAt(j);
				}
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(char[][] A) {
		int N = A.length;
		int M = A[0].length;

		int result = 0;
		for (int boy1 = 0; boy1 < N; boy1++) {
			for (int boy2 = boy1 + 1; boy2 < N; boy2++) {
				for (int girl = 0; girl < M; girl++) {
					if (A[boy1][girl] == '1' && A[boy2][girl] == '1') {
						result++;
					}
				}
			}
		}
		return result;
	}
}
