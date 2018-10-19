import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[] numbers = new int[t];
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(numbers);

		for (int number : numbers) {
			System.out.println(number);
		}

		br.close();
	}
}
