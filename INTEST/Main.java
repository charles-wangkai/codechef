import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();

			if (t % k == 0) {
				result++;
			}
		}
		System.out.println(result);

		sc.close();
	}
}
