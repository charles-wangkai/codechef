import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cumScore1 = 0;
		int cumScore2 = 0;
		int maxLead = -1;
		int winner = -1;
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int S = sc.nextInt();
			int T = sc.nextInt();

			cumScore1 += S;
			cumScore2 += T;

			int lead = cumScore1 - cumScore2;
			if (Math.abs(lead) > maxLead) {
				maxLead = Math.abs(lead);
				winner = (lead > 0) ? 1 : 2;
			}
		}
		System.out.println(winner + " " + maxLead);

		sc.close();
	}
}
