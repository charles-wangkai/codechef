import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static final Map<String, String> ID_TO_SHIP = new HashMap<>();
	static {
		ID_TO_SHIP.put("B", "BattleShip");
		ID_TO_SHIP.put("C", "Cruiser");
		ID_TO_SHIP.put("D", "Destroyer");
		ID_TO_SHIP.put("F", "Frigate");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String id = sc.next();

			System.out.println(solve(id));
		}

		sc.close();
	}

	static String solve(String id) {
		return ID_TO_SHIP.get(id.toUpperCase());
	}
}
