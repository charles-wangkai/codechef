import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			double D = sc.nextDouble();
			int U = sc.nextInt();
			int N = sc.nextInt();
			Plan[] plans = new Plan[N];
			for (int i = 0; i < plans.length; i++) {
				int M = sc.nextInt();
				double R = sc.nextDouble();
				int C = sc.nextInt();

				plans[i] = new Plan(M, R, C);
			}

			System.out.println(solve(D, U, plans));
		}

		sc.close();
	}

	static int solve(double D, int U, Plan[] plans) {
		double minCost = U * D;
		int bestIndex = 0;
		for (int i = 0; i < plans.length; i++) {
			double cost = (plans[i].C + U * plans[i].M * plans[i].R) / plans[i].M;

			if (cost < minCost) {
				minCost = cost;
				bestIndex = i + 1;
			}
		}
		return bestIndex;
	}
}

class Plan {
	int M;
	double R;
	int C;

	Plan(int m, double r, int c) {
		M = m;
		R = r;
		C = c;
	}
}