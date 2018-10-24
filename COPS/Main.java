import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final int HOUSE_NUM = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int M = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[] cops = new int[M];
			for (int i = 0; i < cops.length; i++) {
				cops[i] = sc.nextInt() - 1;
			}

			System.out.println(solve(cops, x, y));
		}

		sc.close();
	}

	static int solve(int[] cops, int x, int y) {
		boolean[] covers = new boolean[HOUSE_NUM];
		for (int cop : cops) {
			for (int i = Math.max(0, cop - x * y); i <= Math.min(covers.length - 1, cop + x * y); i++) {
				covers[i] = true;
			}
		}

		return (int) IntStream.range(0, covers.length).filter(i -> !covers[i]).count();
	}
}
