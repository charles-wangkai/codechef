import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			Person person1 = readPerson(sc);
			Person person2 = readPerson(sc);
			Person person3 = readPerson(sc);

			System.out.println(solve(person1, person2, person3) ? "yes" : "no");
		}

		sc.close();
	}

	static Person readPerson(Scanner sc) {
		int hardWork = sc.nextInt();
		int intelligence = sc.nextInt();
		int persistence = sc.nextInt();

		return new Person(hardWork, intelligence, persistence);
	}

	static boolean solve(Person person1, Person person2, Person person3) {
		return isValidOrder(person1, person2, person3) || isValidOrder(person1, person3, person2)
				|| isValidOrder(person2, person1, person3) || isValidOrder(person2, person3, person1)
				|| isValidOrder(person3, person1, person2) || isValidOrder(person3, person2, person1);
	}

	static boolean isValidOrder(Person personA, Person personB, Person personC) {
		return isBetter(personA, personB) && isBetter(personB, personC);
	}

	static boolean isBetter(Person personX, Person personY) {
		return personX.hardWork >= personY.hardWork && personX.intelligence >= personY.intelligence
				&& personX.persistence >= personY.persistence && (personX.hardWork > personY.hardWork
						|| personX.intelligence > personY.intelligence || personX.persistence > personY.persistence);
	}
}

class Person {
	int hardWork;
	int intelligence;
	int persistence;

	Person(int hardWork, int intelligence, int persistence) {
		this.hardWork = hardWork;
		this.intelligence = intelligence;
		this.persistence = persistence;
	}
}