import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			Train[] trains = new Train[n];
			for (int i = 0; i < trains.length; i++) {
				int x = sc.nextInt();
				int l = sc.nextInt();
				int f = sc.nextInt();

				trains[i] = new Train(x, l, f);
			}

			System.out.println(solve(trains));
		}

		sc.close();
	}

	static int solve(Train[] trains) {
		int time = 0;
		for (Train train : trains) {
			if (time < train.x) {
				time = train.x;
			} else {
				time = divideToCeil(time - train.x, train.f) * train.f + train.x;
			}

			time += train.l;
		}
		return time;
	}

	static int divideToCeil(int a, int b) {
		return a / b + (a % b == 0 ? 0 : 1);
	}
}

class Train {
	int x;
	int l;
	int f;

	Train(int x, int l, int f) {
		this.x = x;
		this.l = l;
		this.f = f;
	}
}