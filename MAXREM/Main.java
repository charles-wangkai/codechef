import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(solve(A));

		sc.close();
	}

	static int solve(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		for (int number : A) {
			set.add(number);
		}

		List<Integer> sortedSet = new ArrayList<>(set);
		Collections.sort(sortedSet);

		return (sortedSet.size() == 1) ? 0 : sortedSet.get(sortedSet.size() - 2);
	}
}
