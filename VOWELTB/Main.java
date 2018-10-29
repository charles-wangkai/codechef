import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);
		System.out.println(solve(c) ? "Vowel" : "Consonant");

		sc.close();
	}

	static boolean solve(char c) {
		return "AEIOU".indexOf(c) >= 0;
	}
}
