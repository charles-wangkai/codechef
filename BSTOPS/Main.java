import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BST bst = null;
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String command = sc.next();
			int x = sc.nextInt();

			if (command.equals("i")) {
				bst = insert(bst, x, 1);
			} else if (command.equals("d")) {
				bst = delete(bst, x);
			}
		}

		sc.close();
	}

	static BST insert(BST bst, int value, int position) {
		if (bst == null) {
			System.out.println(position);

			return new BST(value, position);
		}

		if (value < bst.value) {
			bst.left = insert(bst.left, value, position * 2);
		} else {
			bst.right = insert(bst.right, value, position * 2 + 1);
		}
		return bst;
	}

	static BST delete(BST bst, int value) {
		if (value == bst.value) {
			System.out.println(bst.position);

			if (bst.left == null) {
				return bst.right;
			} else if (bst.right == null) {
				return bst.left;
			}

			bst.value = getMinValue(bst.right);
			bst.right = delete(bst.right, bst.value);
		} else if (value < bst.value) {
			bst.left = delete(bst.left, value);
		} else {
			bst.right = delete(bst.right, value);
		}
		return bst;
	}

	static int getMinValue(BST bst) {
		while (bst.left != null) {
			bst = bst.left;
		}
		return bst.value;
	}
}

class BST {
	int value;
	int position;
	BST left;
	BST right;

	BST(int value, int position) {
		this.value = value;
		this.position = position;
	}
}