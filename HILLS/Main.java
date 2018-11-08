import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int U = sc.nextInt();
			int D = sc.nextInt();
			int[] H = new int[N];
			for (int i = 0; i < H.length; i++) {
				H[i] = sc.nextInt();
			}

			System.out.println(solve(H, U, D));
		}

		sc.close();
	}

	static int solve(int[] H, int U, int D) {
		boolean parachuteUsed = false;
		int index = 0;
		while (true) {
			if (index == H.length - 1) {
				break;
			} else if (H[index + 1] <= H[index] + U && H[index + 1] >= H[index] - D) {
				index++;
			} else if (!parachuteUsed && H[index + 1] < H[index]) {
				parachuteUsed = true;
				index++;
				;
			} else {
				break;
			}
		}
		return index + 1;
	}
}
