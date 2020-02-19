import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] A = readArray(sc, N);
            int[] B = readArray(sc, N);

            System.out.println(solve(A, B));
        }

        sc.close();
    }

    static int[] readArray(Scanner sc, int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; ++i) {
            result[i] = sc.nextInt();
        }

        return result;
    }

    static long solve(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        return IntStream.range(0, A.length).mapToLong(i -> Math.min(A[i], B[i])).sum();
    }
}