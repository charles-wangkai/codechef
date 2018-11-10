import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(solve(A, K));

		sc.close();
	}

	static int solve(int[] A, int K) {
		PriorityQueue<Element> pq = new PriorityQueue<>(
				(element1, element2) -> Double.compare(element1.logProduct, element2.logProduct));
		pq.offer(new Element(Math.log(A[0]), A[0], 0));
		int product = A[0];
		for (int i = 1; i < A.length; i++) {
			while (i - pq.peek().index > K) {
				pq.poll();
			}

			Element head = pq.peek();
			double logProduct = head.logProduct + Math.log(A[i]);
			product = multiplyMod(head.product, A[i]);
			pq.offer(new Element(logProduct, product, i));
		}
		return product;
	}

	static int multiplyMod(int x, int y) {
		return (int) ((long) x * y % MOD_DIVISOR);
	}
}

class Element {
	double logProduct;
	int product;
	int index;

	Element(double logProduct, int product, int index) {
		this.logProduct = logProduct;
		this.product = product;
		this.index = index;
	}
}