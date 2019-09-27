import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			Warrior[] soints = readArray(sc, N);
			Warrior[] sofloats = readArray(sc, M);

			System.out.println(solve(soints, sofloats));
		}

		sc.close();
	}

	static Warrior[] readArray(Scanner sc, int size) {
		Warrior[] result = new Warrior[size];
		for (int i = 0; i < result.length; i++) {
			int C = sc.nextInt();
			int L = sc.nextInt();

			result[i] = new Warrior(C, L);
		}

		return result;
	}

	static int solve(Warrior[] soints, Warrior[] sofloats) {
		Map<Integer, Integer> levelToDelta = new HashMap<>();
		for (Warrior soint : soints) {
			updateMap(levelToDelta, soint.L, soint.C);
		}
		for (Warrior sofloat : sofloats) {
			updateMap(levelToDelta, sofloat.L, -sofloat.C);
		}

		return levelToDelta.values().stream().mapToInt(delta -> Math.max(0, -delta)).sum();
	}

	static void updateMap(Map<Integer, Integer> levelToDelta, int level, int delta) {
		levelToDelta.put(level, levelToDelta.getOrDefault(level, 0) + delta);
	}
}

class Warrior {
	int C;
	int L;

	Warrior(int C, int L) {
		this.C = C;
		this.L = L;
	}
}