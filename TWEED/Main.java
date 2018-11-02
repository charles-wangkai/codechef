import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String P = sc.next();
			int[] a = new int[N];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(solve(a, P) ? "Dee" : "Dum");
		}

		sc.close();
	}

	static boolean solve(int[] a, String P) {
		return P.equals("Dee") && a.length == 1 && a[0] % 2 == 0;
	}
}
