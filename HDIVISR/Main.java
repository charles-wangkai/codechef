import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    System.out.println(solve(N));

    sc.close();
  }

  static int solve(int N) {
    return IntStream.rangeClosed(1, 10).filter(x -> N % x == 0).max().getAsInt();
  }
}
