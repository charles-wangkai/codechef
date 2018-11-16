import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		int[] ids1 = readArray(sc, N1);
		int[] ids2 = readArray(sc, N2);
		int[] ids3 = readArray(sc, N3);

		int[] result = solve(ids1, ids2, ids3);
		System.out.println(result.length);
		Arrays.stream(result).forEach(System.out::println);

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static int[] solve(int[] ids1, int[] ids2, int[] ids3) {
		Set<Integer> idSet1 = Arrays.stream(ids1).boxed().collect(Collectors.toSet());
		Set<Integer> idSet2 = Arrays.stream(ids2).boxed().collect(Collectors.toSet());

		Set<Integer> idSet1And2 = new HashSet<>(idSet1);
		idSet1And2.retainAll(idSet2);

		return IntStream
				.concat(idSet1And2.stream().mapToInt(x -> x),
						Arrays.stream(ids3).filter(id3 -> idSet1.contains(id3) || idSet2.contains(id3)))
				.distinct().sorted().toArray();
	}
}
