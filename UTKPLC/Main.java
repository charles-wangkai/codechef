import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      String[] preferences = new String[3];
      for (int i = 0; i < preferences.length; ++i) {
        preferences[i] = sc.next();
      }
      String offer1 = sc.next();
      String offer2 = sc.next();

      System.out.println(solve(preferences, offer1, offer2));
    }

    sc.close();
  }

  static String solve(String[] preferences, String offer1, String offer2) {
    Map<String, Integer> companyToOrder =
        IntStream.range(0, preferences.length)
            .boxed()
            .collect(Collectors.toMap(i -> preferences[i], i -> i));

    return (companyToOrder.get(offer1) < companyToOrder.get(offer2)) ? offer1 : offer2;
  }
}
