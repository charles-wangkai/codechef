import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(solve(L, B));

		sc.close();
	}

	static String solve(int L, int B) {
		int area = L * B;
		int perimeter = (L + B) * 2;

		String comparison;
		if (area > perimeter) {
			comparison = "Area";
		} else if (area < perimeter) {
			comparison = "Peri";
		} else {
			comparison = "Eq";
		}

		return String.format("%s\n%d", comparison, Math.max(area, perimeter));
	}
}
