import java.util.Scanner;

public class Main {
	static final int LIMIT = 31;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int D = sc.nextInt();
			int[] d = new int[D];
			int[] p = new int[D];
			for (int i = 0; i < D; i++) {
				d[i] = sc.nextInt();
				p[i] = sc.nextInt();
			}
			int Q = sc.nextInt();
			int[] dead = new int[Q];
			int[] req = new int[Q];
			for (int i = 0; i < Q; i++) {
				dead[i] = sc.nextInt();
				req[i] = sc.nextInt();
			}
			System.out.print(solve(d, p, dead, req));
		}

		sc.close();
	}

	static String solve(int[] d, int[] p, int[] dead, int[] req) {
		int[] problems = new int[LIMIT + 1];
		for (int i = 0; i < d.length; i++) {
			problems[d[i]] = p[i];
		}

		int sum = 0;
		int[] sums = new int[problems.length];
		for (int i = 0; i < sums.length; i++) {
			sum += problems[i];
			sums[i] = sum;
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < dead.length; i++) {
			result.append((req[i] <= sums[dead[i]]) ? "Go Camp" : "Go Sleep").append("\n");
		}
		return result.toString();
	}
}
