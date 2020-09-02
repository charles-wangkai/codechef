import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; ++tc) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; ++i) {
                A[i] = sc.nextInt();
            }

            System.out.println(solve(A));
        }

        sc.close();
    }

    static int solve(int[] A) {
        Map<Integer, Integer> valueToFreq = new HashMap<>();
        for (int value : A) {
            valueToFreq.put(value, valueToFreq.getOrDefault(value, 0) + 1);
        }

        Map<Integer, Integer> freqToCount = new HashMap<>();
        for (int freq : valueToFreq.values()) {
            freqToCount.put(freq, freqToCount.getOrDefault(freq, 0) + 1);
        }

        int maxCount = freqToCount.values().stream().mapToInt(x -> x).max().getAsInt();

        return freqToCount.keySet().stream().filter(freq -> freqToCount.get(freq) == maxCount).mapToInt(x -> x).min()
                .getAsInt();
    }
}