import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int S = sc.nextInt();
			int SG = sc.nextInt();
			int FG = sc.nextInt();
			int D = sc.nextInt();
			int T = sc.nextInt();

			System.out.println(solve(S, SG, FG, D, T));
		}

		sc.close();
	}

	static String solve(int S, int SG, int FG, int D, int T) {
		int realDistance = D * 50 * 3600;
		int sebiDistance = (SG - S) * T * 1000;
		int fatherDistance = (FG - S) * T * 1000;

		int sebiDiff = Math.abs(sebiDistance - realDistance);
		int fatherDiff = Math.abs(fatherDistance - realDistance);

		if (sebiDiff < fatherDiff) {
			return "SEBI";
		} else if (sebiDiff > fatherDiff) {
			return "FATHER";
		} else {
			return "DRAW";
		}
	}
}
