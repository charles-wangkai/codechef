import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      String P = readTime(sc);
      int N = sc.nextInt();
      String[] L = new String[N];
      String[] R = new String[N];
      for (int i = 0; i < N; ++i) {
        L[i] = readTime(sc);
        R[i] = readTime(sc);
      }

      System.out.println(solve(P, L, R));
    }

    sc.close();
  }

  static String readTime(Scanner sc) {
    String part1 = sc.next();
    String part2 = sc.next();

    return String.format("%s %s", part1, part2);
  }

  static String solve(String P, String[] L, String[] R) {
    int pMinutes = convertToMinutes(P);

    return IntStream.range(0, L.length)
        .mapToObj(
            i ->
                (convertToMinutes(L[i]) <= pMinutes && convertToMinutes(R[i]) >= pMinutes)
                    ? "1"
                    : "0")
        .collect(Collectors.joining());
  }

  static int convertToMinutes(String time) {
    int hour = Integer.parseInt(time.substring(0, 2));
    int minute = Integer.parseInt(time.substring(3, 5));
    String half = time.substring(6);

    if (hour == 12 && half.equals("AM")) {
      hour = 0;
    } else if (hour != 12 && half.equals("PM")) {
      hour += 12;
    }

    return hour * 60 + minute;
  }
}
