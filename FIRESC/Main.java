import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			Friendship[] friendships = new Friendship[M];
			for (int i = 0; i < friendships.length; i++) {
				int e1 = sc.nextInt();
				int e2 = sc.nextInt();

				friendships[i] = new Friendship(e1, e2);
			}

			System.out.println(solve(N, friendships));
		}

		sc.close();
	}

	static String solve(int N, Friendship[] friendships) {
		Employee[] employees = new Employee[N];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee(-1, 1);
		}

		for (Friendship friendship : friendships) {
			int root1 = findRoot(employees, friendship.e1 - 1);
			int root2 = findRoot(employees, friendship.e2 - 1);

			if (root1 != root2) {
				employees[root1].size += employees[root2].size;
				employees[root2].parent = root1;
			}
		}

		List<Employee> leaders = Arrays.stream(employees).filter(employee -> employee.parent == -1)
				.collect(Collectors.toList());
		return String.format("%d %d", leaders.size(),
				leaders.stream().mapToInt(leader -> leader.size).reduce(Main::multiplyMod).getAsInt());
	}

	static int multiplyMod(int x, int y) {
		return (int) ((long) x * y % MOD_DIVISOR);
	}

	static int findRoot(Employee[] employees, int index) {
		int root = index;
		while (employees[root].parent != -1) {
			root = employees[root].parent;
		}

		int p = index;
		while (p != root) {
			int next = employees[p].parent;
			employees[p].parent = root;

			p = next;
		}

		return root;
	}
}

class Employee {
	int parent;
	int size;

	Employee(int parent, int size) {
		this.parent = parent;
		this.size = size;
	}
}

class Friendship {
	int e1;
	int e2;

	Friendship(int e1, int e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
}