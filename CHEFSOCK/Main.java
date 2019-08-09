import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jacketCost = sc.nextInt();
		int sockCost = sc.nextInt();
		int money = sc.nextInt();
		System.out.println(solve(jacketCost, sockCost, money));

		sc.close();
	}

	static String solve(int jacketCost, int sockCost, int money) {
		return ((money - jacketCost) / sockCost % 2 == 0) ? "Lucky Chef" : "Unlucky Chef";
	}
}
