import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(int[] A) {
		Map<Integer, Integer> lengthToCount = new HashMap<>();
		for (int length : A) {
			lengthToCount.put(length, lengthToCount.getOrDefault(length, 0) + 1);
		}

		List<Integer> candidateLengths = lengthToCount.keySet().stream()
				.filter(length -> lengthToCount.get(length) >= 2).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		if (candidateLengths.isEmpty()) {
			return -1;
		}

		int maxCandidateLength = candidateLengths.get(0);
		if (lengthToCount.get(maxCandidateLength) >= 4) {
			return maxCandidateLength * maxCandidateLength;
		}

		if (candidateLengths.size() == 1) {
			return -1;
		}

		return maxCandidateLength * candidateLengths.get(1);
	}
}
