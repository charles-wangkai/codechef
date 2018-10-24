import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			String expression = sc.next();

			System.out.println(solve(expression));
		}

		sc.close();
	}

	static String solve(String expression) {
		List<Element> elements = new ArrayList<>();
		int depth = 0;
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			if (ch == '(') {
				depth++;
			} else if (ch == ')') {
				depth--;
			} else {
				elements.add(new Element(depth, String.valueOf(ch)));

				while (elements.size() >= 3
						&& elements.get(elements.size() - 1).depth == elements.get(elements.size() - 3).depth) {
					Element rightOperand = elements.remove(elements.size() - 1);
					Element operator = elements.remove(elements.size() - 1);
					Element leftOperand = elements.remove(elements.size() - 1);

					elements.add(
							new Element(leftOperand.depth - 1, leftOperand.part + rightOperand.part + operator.part));
				}
			}
		}
		return elements.get(0).part;
	}
}

class Element {
	int depth;
	String part;

	Element(int depth, String part) {
		this.depth = depth;
		this.part = part;
	}
}