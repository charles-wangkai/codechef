import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int number = sc.nextInt();

			if (number == 42) {
				break;
			}

			System.out.println(number);
		}

		sc.close();
	}
}
