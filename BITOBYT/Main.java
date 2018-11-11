import java.util.Scanner;

public class Main {
	static final int TIME_LIMIT = 1600;

	static State[] states = buildStates();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static State[] buildStates() {
		State[] states = new State[TIME_LIMIT + 1];
		for (int i = 0; i < states.length; i++) {
			states[i] = new State();
		}
		states[0].addedBits = 1;

		long bits = 0;
		long nibbles = 0;
		long bytes = 0;
		for (int i = 0; i < states.length; i++) {
			if (i + 2 < states.length) {
				states[i + 2].removedBits += states[i].addedBits;
				states[i + 2].addedNibbles += states[i].addedBits;
			}
			if (i + 8 < states.length) {
				states[i + 8].removedNibbles += states[i].addedNibbles;
				states[i + 8].addedBytes += states[i].addedNibbles;
			}
			if (i + 16 < states.length) {
				states[i + 16].removedBytes += states[i].addedBytes;
				states[i + 16].addedBits += states[i].addedBytes * 2;
			}

			bits += states[i].addedBits - states[i].removedBits;
			nibbles += states[i].addedNibbles - states[i].removedNibbles;
			bytes += states[i].addedBytes - states[i].removedBytes;

			states[i].bits = bits;
			states[i].nibbles = nibbles;
			states[i].bytes = bytes;
		}

		return states;
	}

	static String solve(int N) {
		return String.format("%d %d %d", states[N - 1].bits, states[N - 1].nibbles, states[N - 1].bytes);
	}
}

class State {
	long bits;
	long nibbles;
	long bytes;

	long addedBits;
	long addedNibbles;
	long addedBytes;

	long removedBits;
	long removedNibbles;
	long removedBytes;
}