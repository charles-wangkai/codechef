import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int D1 = sc.nextInt();
    int V1 = sc.nextInt();
    int D2 = sc.nextInt();
    int V2 = sc.nextInt();
    int P = sc.nextInt();

    System.out.println(solve(D1, V1, D2, V2, P));

    sc.close();
  }

  static int solve(int D1, int V1, int D2, int V2, int P) {
    int result = 0;
    while (P > 0) {
      ++result;

      if (result >= D1) {
        P -= V1;
      }

      if (result >= D2) {
        P -= V2;
      }
    }

    return result;
  }
}
