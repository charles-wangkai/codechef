import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] speeds = new int[N];
			for (int i = 0; i < speeds.length; i++) {
				speeds[i] = sc.nextInt();
			}

			System.out.println(solve(speeds));
		}

		sc.close();
	}

	static int solve(int[] speeds) {
		int result = 0;
		int min = Integer.MAX_VALUE;
		for (int speed : speeds) {
			if (speed <= min) {
				result++;
				min = speed;
			}
		}
		return result;
	}
}
